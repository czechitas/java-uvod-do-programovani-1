package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level15 {

    void run() {
        // TODO: Write a program for Red

        // Sample commands:
        // turnLeft();
        // turnRight();
        // moveForward();
        // while (notFinished()) {
        //     commands
        // }
        // if (isPathForward()) {
        //     commands
        // }
        // if (isPathRight()) {
        //     commands
        // }
        // if (isPathLeft()) {
        //     commands
        // }
    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell. EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Well, this is similar to the previous puzzle, but this time   if ()   and   while ()   together.");
        setGameBoardBirdPosition(2, 2, BirdOrientation.EAST);
        setGameBoardPigPosition(1, 6);
    }

}
