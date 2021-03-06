package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level05 {

    void run() {
        // TODO: Write a program for Red

        // Sample commands:
        // turnLeft();
        // turnRight();
        // moveForward();
    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.STONE_TRIANGLE, Cell.STONE_BOX, Cell.EMPTY, Cell.TNT, Cell.GLASS_TRIANGLE, Cell.EMPTY, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX},
            {Cell.STONE_BOX, Cell.STONE_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.STONE_BOX, Cell.STONE_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_BOX},
            {Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Keep calm and catch the Pig. It won't annoy me much longer!");
        setGameBoardPlayerPosition(2, 3, PlayerOrientation.EAST);
        setGameBoardEnemyPosition(5, 3);
    }

}
