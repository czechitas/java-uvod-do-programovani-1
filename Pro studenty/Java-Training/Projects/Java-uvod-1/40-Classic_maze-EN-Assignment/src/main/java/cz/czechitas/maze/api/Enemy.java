package cz.czechitas.maze.api;

public class Enemy {

    public Enemy(int x, int y) {
        Commands.setGameBoardEnemyPosition(x, y);
    }

    public boolean notFinished() {
        return Commands.notFinished();
    }
}
