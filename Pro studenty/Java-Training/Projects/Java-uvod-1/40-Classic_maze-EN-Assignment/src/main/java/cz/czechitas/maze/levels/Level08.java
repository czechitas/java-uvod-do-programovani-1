package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level08 {

    void run() {
        // TODO: Write a program for Red

        // You can use more loops one after the other.
        // for (var count = 0; count < 4; count++) {
        //     commands
        // }
        // for (var count2 = 0; count2 < 5; count2++) {
        //     commands
        // }

        // Sample commands:
        // turnLeft();
        // turnRight();
        // moveForward();
    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.EMPTY, Cell.WOODEN_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.EMPTY, Cell.STONE_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.WOODEN_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.STONE_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Help me get rid of the annoying Pig in 5 commands.   for ()   loop can be nested in another   for ()");
        setGameBoardBirdPosition(2, 6, BirdOrientation.EAST);
        setGameBoardPigPosition(6, 1);
    }

}
