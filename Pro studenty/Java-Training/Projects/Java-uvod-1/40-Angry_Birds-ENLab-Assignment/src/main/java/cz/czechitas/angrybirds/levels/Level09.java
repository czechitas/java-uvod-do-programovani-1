package cz.czechitas.angrybirds.levels;

import cz.czechitas.angrybirds.api.*;

import static cz.czechitas.angrybirds.api.Commands.*;

public class Level09 {

    void run() {
        // TODO: Write a program for Red

        // First command must be for-loop:
        for (int count = 0; count < 2; count++) {
            // Write 3 other commands to get the pig.
        }

        // Sample commands:
        // turnLeft();
        // turnRight();
        // moveForward();
        // for (int count = 0; count < 4; count++) {
        //     command
        // }
    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_TRIANGLE, Cell.STONE_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.STONE_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.STONE_BOX, Cell.EMPTY, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Get the Pig with no more than 4 commands! First command must be   for ()");
        setGameBoardBirdPosition(2, 3, BirdOrientation.EAST);
        setGameBoardPigPosition(2, 5);
    }

}
