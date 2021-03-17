package cz.czechitas.maze.engine;

public interface VisualListener {

    void levelChanged();

    void startExecuted();

    void pauseExecuted();

    void resetExecuted();

    void nullEndExecuted();

    void negativeEndExecuted();

    void positiveEndExecuted();

}
