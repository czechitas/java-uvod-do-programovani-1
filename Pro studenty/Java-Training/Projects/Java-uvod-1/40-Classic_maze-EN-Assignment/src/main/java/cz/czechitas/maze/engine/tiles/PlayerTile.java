package cz.czechitas.maze.engine.tiles;

import javax.swing.*;
import cz.czechitas.maze.api.*;
import cz.czechitas.maze.engine.util.*;

public class PlayerTile extends GenericTile {

    private PlayerOrientation orientation;
    private Icon uiRightSprite;
    private Icon uiLeftSprite;
    private Icon uiUpSprite;
    private Icon uiDownSprite;

    public PlayerTile() {
        super("player-down.png");
        orientation = PlayerOrientation.SOUTH;
        uiRightSprite = GameUtils.loadSprite("player-right.png");
        uiLeftSprite = GameUtils.loadSprite("player-left.png");
        uiUpSprite = GameUtils.loadSprite("player-up.png");
        uiDownSprite = GameUtils.loadSprite("player-down.png");
    }

    public void setOrientation(PlayerOrientation orientation) {
        this.orientation = orientation;
        if (orientation == PlayerOrientation.NORTH) {
            setSprite(uiUpSprite);
        } else if (orientation == PlayerOrientation.EAST) {
            setSprite(uiRightSprite);
        } else if (orientation == PlayerOrientation.SOUTH) {
            setSprite(uiDownSprite);
        } else if (orientation == PlayerOrientation.WEST) {
            setSprite(uiLeftSprite);
        }
    }

    public Coordinates getForwardLook() {
        int x = getX();
        int y = getY();
        if (orientation == PlayerOrientation.WEST) {
            x = x - 1;
        }
        if (orientation == PlayerOrientation.EAST) {
            x = x + 1;
        }
        if (orientation == PlayerOrientation.NORTH) {
            y = y - 1;
        }
        if (orientation == PlayerOrientation.SOUTH) {
            y = y + 1;
        }
        return new Coordinates(x, y);
    }

    public Coordinates getRightLook() {
        int x = getX();
        int y = getY();
        if (orientation == PlayerOrientation.WEST) {
            y = y - 1;
        }
        if (orientation == PlayerOrientation.EAST) {
            y = y + 1;
        }
        if (orientation == PlayerOrientation.NORTH) {
            x = x + 1;
        }
        if (orientation == PlayerOrientation.SOUTH) {
            x = x - 1;
        }
        return new Coordinates(x, y);
    }

    public Coordinates getLeftLook() {
        int x = getX();
        int y = getY();
        if (orientation == PlayerOrientation.WEST) {
            y = y + 1;
        }
        if (orientation == PlayerOrientation.EAST) {
            y = y - 1;
        }
        if (orientation == PlayerOrientation.NORTH) {
            x = x - 1;
        }
        if (orientation == PlayerOrientation.SOUTH) {
            x = x + 1;
        }
        return new Coordinates(x, y);
    }

    public void move() {
        Coordinates lookCoord = getForwardLook();
        setPosition(lookCoord.getX(), lookCoord.getY());
    }

    public void turnLeft() {
        if (orientation == PlayerOrientation.WEST) {
            setOrientation(PlayerOrientation.SOUTH);
        } else if (orientation == PlayerOrientation.SOUTH) {
            setOrientation(PlayerOrientation.EAST);
        } else if (orientation == PlayerOrientation.EAST) {
            setOrientation(PlayerOrientation.NORTH);
        } else if (orientation == PlayerOrientation.NORTH) {
            setOrientation(PlayerOrientation.WEST);
        }
    }

    public void turnRight() {
        if (orientation == PlayerOrientation.WEST) {
            setOrientation(PlayerOrientation.NORTH);
        } else if (orientation == PlayerOrientation.NORTH) {
            setOrientation(PlayerOrientation.EAST);
        } else if (orientation == PlayerOrientation.EAST) {
            setOrientation(PlayerOrientation.SOUTH);
        } else if (orientation == PlayerOrientation.SOUTH) {
            setOrientation(PlayerOrientation.WEST);
        }
    }

}
