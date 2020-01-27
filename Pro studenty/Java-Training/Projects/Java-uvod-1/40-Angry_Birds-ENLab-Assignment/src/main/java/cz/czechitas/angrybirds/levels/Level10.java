package cz.czechitas.angrybirds.levels;

import cz.czechitas.angrybirds.api.*;

import static cz.czechitas.angrybirds.api.Commands.*;

public class Level10 {

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
            {Cell.STONE_TRIANGLE, Cell.STONE_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.GLASS_TRIANGLE, Cell.STONE_TRIANGLE, Cell.STONE_TRIANGLE, Cell.STONE_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.STONE_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_TRIANGLE, Cell.EMPTY, Cell. EMPTY, Cell.EMPTY, Cell.EMPTY, Cell. EMPTY, Cell.EMPTY, Cell.STONE_BOX},
            {Cell.GLASS_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Try a new command   while ()   ... it means \"repeat, while condition holds\". How about repeat some commands until I catch the Pig?");
        setGameBoardBirdPosition(1, 4, BirdOrientation.EAST);
        setGameBoardPigPosition(6, 4);
    }

}
