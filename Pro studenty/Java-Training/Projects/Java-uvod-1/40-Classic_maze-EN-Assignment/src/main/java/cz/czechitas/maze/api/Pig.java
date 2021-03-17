package cz.czechitas.maze.api;

public class Pig {

    public Pig(int x, int y) {
        Commands.setGameBoardPigPosition(x, y);
    }

    public boolean notFinished() {
        return Commands.notFinished();
    }
}
