package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level06 {

    void run() {
        // TODO: Write a program for Red

        // Sample loop:
        for (var count = 0; count < 4; count++) {
            // All commands from previous levels:
            turnLeft();
            moveForward();
        }


        // In other words:
        // turnLeft();
        // turnRight();
        // moveForward();
        // for (var count = 0; count < 3; count++) {
        //     command
        //     command
        //     command
        // }
    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.STONE_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.STONE_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.STONE_BOX},
            {Cell.WOODEN_TRIANGLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.STONE_BOX, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("There is a way to get to the green Pig in just 2 commands. Can you figure it out?");
        setGameBoardBirdPosition(1, 4, BirdOrientation.EAST);
        setGameBoardPigPosition(6, 4);
    }

}
