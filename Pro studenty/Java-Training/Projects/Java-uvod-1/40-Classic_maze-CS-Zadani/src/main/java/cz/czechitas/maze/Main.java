package cz.czechitas.maze;

import javax.swing.*;
import cz.czechitas.maze.engine.*;
import cz.czechitas.maze.engine.gui.*;
import net.sevecek.util.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::run);
    }

    public static void run() {
        SwingExceptionHandler.install();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.err.println("Failed to set System look and feel for Swing");
        }

        Game game = new Game();
        game.initializeLevels();

        MainWindow mainWindow = new MainWindow(game);
        mainWindow.init();
    }

}
