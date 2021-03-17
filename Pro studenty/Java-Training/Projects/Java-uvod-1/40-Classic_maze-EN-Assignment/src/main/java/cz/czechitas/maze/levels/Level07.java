package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level07 {

    void run() {
        // TODO: Write a program for Red

        // Sample commands:
        // turnLeft();
        // turnRight();
        // moveForward();
        // for (var count = 0; count < 4; count++) {
        //     command
        //     command
        //     command
        // }

    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX},
            {Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.EMPTY, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.EMPTY, Cell.STONE_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.EMPTY, Cell.STONE_TRIANGLE, Cell.STONE_BOX, Cell.WOODEN_BOX},
            {Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Take me to the green alien in just 3 commands.");
        setGameBoardBirdPosition(4, 2, BirdOrientation.EAST);
        setGameBoardPigPosition(4, 7);
    }

}
