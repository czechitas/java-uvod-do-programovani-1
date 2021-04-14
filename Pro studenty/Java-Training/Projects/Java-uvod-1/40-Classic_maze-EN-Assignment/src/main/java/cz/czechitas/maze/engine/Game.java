package cz.czechitas.maze.engine;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.logging.*;
import cz.czechitas.maze.api.*;
import cz.czechitas.maze.engine.tiles.*;
import cz.czechitas.maze.engine.util.*;
import net.sevecek.util.*;

public class Game {

    private Map<String, LevelWrapper> levels;
    private String currentLevelName;
    private LevelWrapper currentLevel;

    public static final long STEP_TIMEOUT = 500L;
    private ExecutorService executor;
    private PauseBarrier pauseBarrier;

    private PlayerTile player;
    private EnemyTile enemy;
    private GenericTile explosion;
    private List<GenericTile> walls;
    private String challengeText;

    private VisualListener visualListener;

    //-------------------------------------------------------------------------

    public Game() {
        executor = Executors.newSingleThreadExecutor();
        visualListener = NoOpVisualListener.getInstance();
        pauseBarrier = new PauseBarrier();
        explosion = new ExplosionTile();
        player = new PlayerTile();
        enemy = new EnemyTile();
        walls = new ArrayList<>();

        // Public API hack so that public API can expose public static moveForward(); etc.
        Commands.setGlobalGame(this);
    }

    //-------------------------------------------------------------------------

    public void initializeLevels() {
        levels = findAllLevels();
    }

    private Map<String, LevelWrapper> findAllLevels() {
        try {
            String packageName = this.getClass().getPackage().getName().replace('.', '/');
            int slashPos = packageName.lastIndexOf("/");
            packageName = packageName.substring(0, slashPos) + "/" + "levels";

            ClassLoader classLoader = getClass().getClassLoader();
            URL classUrl = classLoader.getResource(packageName);
            File levelsFolder = new File(classUrl.toURI());
            String[] classFileNames = levelsFolder.list((dir, name) -> name.endsWith(".class"));

            Map<String, LevelWrapper> levels = new TreeMap<>();
            if (classFileNames != null) {
                for (String classFileName : classFileNames) {
                    classFileName = classFileName.substring(0, classFileName.length() - ".class".length());
                    String levelName = classFileName;
                    classFileName = packageName + "." + classFileName;
                    classFileName = classFileName.replace('/', '.');
                    Class<?> levelClass = classLoader.loadClass(classFileName);
                    Object level = levelClass.newInstance();
                    LevelWrapper levelWrapper = new LevelWrapper(level);
                    levels.put(levelName, levelWrapper);
                }
            }
            return levels;
        } catch (URISyntaxException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw ExceptionUtils.rethrowAsUnchecked(ex);
        }
    }

    public Collection<String> getLevelNames() {
        return levels.keySet();
    }

    //-------------------------------------------------------------------------

    public void setVisualListener(VisualListener listener) {
        visualListener = listener;
    }

    public List<GenericTile> getAllTiles() {
        List<GenericTile> tiles = new ArrayList<>(walls.size() + 3);
        tiles.addAll(walls);
        tiles.add(player);
        tiles.add(enemy);
        tiles.add(explosion);
        return tiles;
    }

    //-------------------------------------------------------------------------

    public void initCurrentLevel() {
        String previousLevelName = loadCurrentLevelFromFile();
        changeLevel(previousLevelName);
    }

    private String loadCurrentLevelFromFile() {
        try {
            File file = new File("current-level.txt");
            InputStream inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = reader.readLine().trim();
            return line;
        } catch (NumberFormatException | IOException e) {
            Logger.getAnonymousLogger().warning("Unable to save current level: " + e.getMessage());
            return "non-existent";
        }
    }

    public void changeLevel(String newLevelName) {
        if (currentLevelName != null && currentLevelName.equals(newLevelName)) {
            return;
        }
        if (levels.isEmpty()) {
            throw new ApplicationPublicException("Nebyly nalezeny žádné levely");
        }

        String previousLevelName = currentLevelName;
        LevelWrapper newLevel = levels.get(newLevelName);
        if (newLevel == null) {
            Map.Entry<String, LevelWrapper> levelEntry = levels.entrySet().iterator().next();
            newLevelName = levelEntry.getKey();
            newLevel = levelEntry.getValue();
        }
        currentLevelName = newLevelName;
        currentLevel = newLevel;
        clearPreviousLevel();
        newLevel.doSetupGameBoard();

        if (previousLevelName != null) {
            // If not first time level setup, save change
            saveCurrentLevelToFile(currentLevelName);
        }

        GameUtils.notifyVisualListener(visualListener::levelChanged);
    }

    //-------------------------------------------------------------------------

    public void setChallengeText(String text) {
        challengeText = text;
    }

    public void saveCurrentLevelToFile(String levelName) {
        try {
            File file = new File("current-level.txt");
            file.delete();
            OutputStream outputStream = new FileOutputStream(file, false);
            Writer writer = new OutputStreamWriter(outputStream);
            writer.write(levelName);
            writer.close();
        } catch (IOException e) {
            Logger.getAnonymousLogger().warning("Unable to save current level: " + e.getMessage());
        }
    }

    public String getCurrentLevelName() {
        return currentLevelName;
    }

    public String getChallengeText() {
        return challengeText;
    }

    //-------------------------------------------------------------------------

    public void start() {
        if (pauseBarrier.isLocked()) {
            pauseBarrier.unlock();
        } else {
            executor.execute(this::executeProgramThread);
        }
        GameUtils.notifyVisualListener(visualListener::startExecuted);
    }

    public void pause() {
        pauseBarrier.lock();
        GameUtils.notifyVisualListener(visualListener::pauseExecuted);
    }

    public void reset() {
        terminate();
        pauseBarrier.unlock();
        clearPreviousLevel();
        currentLevel.doSetupGameBoard();
        GameUtils.notifyVisualListener(visualListener::resetExecuted);
    }

    private void clearPreviousLevel() {
        player.setPosition(-1, -1);
        enemy.setPosition(-1, -1);
        explosion.setPosition(-1, -1);
        clearWalls();
        challengeText = "";
    }

    public void terminate() {
        executor.shutdownNow();
        executor = Executors.newSingleThreadExecutor();
    }

    //-------------------------------------------------------------------------

    // Parallel program thread
    private void executeProgramThread() {
        try {
            ThreadUtils.sleep(STEP_TIMEOUT);
            currentLevel.doRun();
            ThreadUtils.sleep(3L * STEP_TIMEOUT);
            GameUtils.notifyVisualListener(visualListener::nullEndExecuted);
        } catch (CancellationException e) {
            // CancellationException is thrown if the program is either:
            // - finished by player killing enemy
            // - finished by player killing itself
            // - reset (stopped)
            // - MainWindow is closed
            //
            // In all cases, it would be caused by terminate()
            // Handle it by swallowing the exception and terminate
        }
    }

    //- - - - - - - - -

    public void movePlayerForward() {
        pauseBarrier.goThrough();
        uiMovePlayer();
        ThreadUtils.sleep(STEP_TIMEOUT);
    }

    public void turnPlayerLeft() {
        pauseBarrier.goThrough();
        player.turnLeft();
        ThreadUtils.sleep(STEP_TIMEOUT);
    }

    public void turnPlayerRight() {
        pauseBarrier.goThrough();
        player.turnRight();
        ThreadUtils.sleep(STEP_TIMEOUT);
    }

    public boolean isPlayerPathForward() {
        pauseBarrier.goThrough();
        return uiPlayerPathForward();
    }

    public boolean isPlayerPathLeft() {
        pauseBarrier.goThrough();
        return uiPlayerPathLeft();
    }

    public boolean isPlayerPathRight() {
        pauseBarrier.goThrough();
        return uiPlayerPathRight();
    }

    //- - - - - - - - -

    private void uiMovePlayer() {
        player.move();
        detectPlayerOutOfRange();
        detectCollisionPlayerAndEnemy();
        detectCollisionWithWall();
    }

    private boolean uiPlayerPathForward() {
        Coordinates lookCoord = player.getForwardLook();
        return isWall(lookCoord.getX(), lookCoord.getY());
    }

    private boolean uiPlayerPathLeft() {
        Coordinates lookCoord = player.getLeftLook();
        return isWall(lookCoord.getX(), lookCoord.getY());
    }

    private boolean uiPlayerPathRight() {
        Coordinates lookCoord = player.getRightLook();
        return isWall(lookCoord.getX(), lookCoord.getY());
    }

    private void detectPlayerOutOfRange() {
        if (player.getX() < 0 || player.getX() >= 8 || player.getY() < 0 || player.getY() >= 8) {
            killPlayer();
        }
    }

    public void detectCollisionPlayerAndEnemy() {
        if (!notFinished()) {
            explode();
        }
    }

    public boolean notFinished() {
        return player.getX() != enemy.getX() || player.getY() != enemy.getY();
    }

    public void explode() {
        int x = enemy.getX();
        int y = enemy.getY();
        enemy.setPosition(-1, -1);
        player.setPosition(-1, -1);
        explosion.setPosition(x, y);
        ThreadUtils.sleep(3L * STEP_TIMEOUT);
        terminate();
        GameUtils.notifyVisualListener(visualListener::positiveEndExecuted);
    }

    public void detectCollisionWithWall() {
        for (GenericTile wall : walls) {
            int wallX = wall.getX();
            int wallY = wall.getY();
            if (wallX == player.getX() && wallY == player.getY()) {
                killPlayer();
            }
        }
    }

    public void killPlayer() {
        ThreadUtils.sleep(3L * STEP_TIMEOUT);
        terminate();
        GameUtils.notifyVisualListener(visualListener::negativeEndExecuted);
    }

    public void setWalls(Cell[][] cells) {
        clearWalls();
        int y = 0;
        for (Cell[] cellRow : cells) {
            int x = 0;
            for (Cell cell : cellRow) {
                if (cell == Cell.WOODEN_BOX) {
                    setWall(x, y, "wooden-wall.png");
                } else if (cell == Cell.STONE_BOX) {
                    setWall(x, y, "stone-wall.png");
                } else if (cell == Cell.WOODEN_TRIANGLE) {
                    setWall(x, y, "wooden-triangle.png");
                } else if (cell == Cell.STONE_TRIANGLE) {
                    setWall(x, y, "stone-triangle.png");
                } else if (cell == Cell.GLASS_TRIANGLE) {
                    setWall(x, y, "glass-triangle.png");
                } else if (cell == Cell.TNT) {
                    setWall(x, y, "bomb.png");
                }
                x++;
            }
            y++;
        }
    }

    private void setWall(int x, int y, String spriteName) {
        GenericTile wall = new GenericTile(spriteName);
        wall.setPosition(x, y);
        walls.add(wall);
    }

    private void clearWalls() {
        for (GenericTile wall : walls) {
            wall.setPosition(-1, -1);
        }
        walls.clear();
    }

    private boolean isWall(int x, int y) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            return true;
        }
        for (GenericTile wall : walls) {
            int wallX = wall.getX();
            int wallY = wall.getY();
            if (wallX == x && wallY == y) {
                return false;
            }
        }
        return true;
    }

    //-------------------------------------------------------------------------

    public void setPlayerPosition(int x, int y, PlayerOrientation orientation) {
        player.setPosition(x, y);
        player.setOrientation(orientation);
    }

    public void setEnemyPosition(int x, int y) {
        enemy.setPosition(x, y);
    }

}
