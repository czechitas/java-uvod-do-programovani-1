package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level11 {

    void run() {
        // TODO: Write a program for Red

        // Sample commands:
        // turnLeft();
        // turnRight();
        // moveForward();
        // while (notFinished()) {
        //     commands
        // }
    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX},
            {Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX},
            {Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.STONE_BOX, Cell.STONE_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_TRIANGLE, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.STONE_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.EMPTY, Cell.STONE_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.STONE_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX},
            {Cell.STONE_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("One more time to mater it - can you do it with just 4 commands and the loop?:   while ()");
        setGameBoardBirdPosition(2, 5, BirdOrientation.EAST);
        setGameBoardPigPosition(2, 3);
    }

}
