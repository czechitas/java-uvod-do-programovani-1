package cz.czechitas.maze.engine.tiles;

import javax.swing.*;

public interface VisualTileListener {

    void onIconChange(Icon sprite);

    void onLocationChange(int previousX, int previousY, int x, int y);
}
