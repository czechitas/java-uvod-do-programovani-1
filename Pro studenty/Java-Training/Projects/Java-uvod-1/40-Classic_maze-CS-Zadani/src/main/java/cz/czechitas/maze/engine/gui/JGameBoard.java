package cz.czechitas.maze.engine.gui;

import java.awt.*;
import javax.swing.*;
import cz.czechitas.maze.engine.tiles.*;
import cz.czechitas.maze.engine.util.*;

public class JGameBoard extends JLayeredPane {

    private JLabel labBackground;
    private JPanel pnlWalls;
    private JTile player;
    private JTile enemy;
    private JTile explosion;

    public JGameBoard() {
        Icon imgBackground = GameUtils.loadSprite("background.png");
        Dimension gameBoardSize = new Dimension(imgBackground.getIconWidth(), imgBackground.getIconHeight());

        setMinimumSize(gameBoardSize);
        setMaximumSize(gameBoardSize);
        setPreferredSize(gameBoardSize);
        setSize(gameBoardSize);

        labBackground = new JLabel();
        labBackground.setIcon(imgBackground);
        labBackground.setMinimumSize(gameBoardSize);
        labBackground.setPreferredSize(gameBoardSize);
        labBackground.setMaximumSize(gameBoardSize);
        labBackground.setSize(gameBoardSize);
        add(labBackground, Integer.valueOf(0));

        pnlWalls = new JPanel(null);
        pnlWalls.setOpaque(false);
        pnlWalls.setMinimumSize(gameBoardSize);
        pnlWalls.setMaximumSize(gameBoardSize);
        pnlWalls.setPreferredSize(gameBoardSize);
        pnlWalls.setSize(gameBoardSize);
        add(pnlWalls, Integer.valueOf(1));
    }

    public void addTile(JTile tile) {
        if (tile.getNonVisualTile() instanceof PlayerTile) {
            player = tile;
            add(player, Integer.valueOf(3));
        } else if (tile.getNonVisualTile() instanceof EnemyTile) {
            enemy = tile;
            add(enemy, Integer.valueOf(2));
        } else if (tile.getNonVisualTile() instanceof ExplosionTile) {
            explosion = tile;
            add(explosion, Integer.valueOf(4));
        } else {
            pnlWalls.add(tile);
        }
    }

    public void clear() {
        pnlWalls.removeAll();
        if (player != null) {
            remove(player);
        }
        if (enemy != null) {
            remove(enemy);
        }
        if (explosion != null) {
            remove(explosion);
            player.setVisible(false);
        }
    }
}
