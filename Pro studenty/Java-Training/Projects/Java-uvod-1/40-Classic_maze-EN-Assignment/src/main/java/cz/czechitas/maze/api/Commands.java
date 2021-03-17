package cz.czechitas.maze.api;

import cz.czechitas.maze.engine.*;

public class Commands {

    private static Game game;

    public static void setGlobalGame(Game game) {
        Commands.game = game;
    }

    public static void moveForward() {
        game.movePlayerForward();
    }

    public static void turnLeft() {
        game.turnPlayerLeft();
    }

    public static void turnRight() {
        game.turnPlayerRight();
    }

    public static boolean isPathForward() {
        return game.isPlayerPathForward();
    }

    public static boolean isPathLeft() {
        return game.isPlayerPathLeft();
    }

    public static boolean isPathRight() {
        return game.isPlayerPathRight();
    }

    public static boolean notFinished() {
        return game.notFinished();
    }

    public static void setGameBoardCells(Cell[][] cells) {
        game.setWalls(cells);
    }

    public static void setGameBoardChallengeText(String text) {
        game.setChallengeText(text);
    }

    public static void setGameBoardPlayerPosition(int x, int y, PlayerOrientation orientation) {
        game.setPlayerPosition(x, y, orientation);
    }

    public static void setGameBoardEnemyPosition(int x, int y) {
        game.setEnemyPosition(x, y);
    }

}
