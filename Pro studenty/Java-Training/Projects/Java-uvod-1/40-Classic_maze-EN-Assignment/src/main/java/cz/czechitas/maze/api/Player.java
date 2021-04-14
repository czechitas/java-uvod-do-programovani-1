package cz.czechitas.maze.api;

public class Player {

    public Player(int x, int y, PlayerOrientation orientation) {
        Commands.setGameBoardPlayerPosition(x, y, orientation);
    }

    public void moveForward() {
        Commands.moveForward();
    }

    public void turnLeft() {
        Commands.turnLeft();
    }

    public void turnRight() {
        Commands.turnRight();
    }

    public boolean isPathForward() {
        return Commands.isPathForward();
    }

    public boolean isPathLeft() {
        return Commands.isPathLeft();
    }

    public boolean isPathRight() {
        return Commands.isPathRight();
    }
}
