package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level16 {

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
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Pig! Pig! Pig! Use command   if ()   ... to get me the Pig in just 4 commands.");
        setGameBoardBirdPosition(6, 1, BirdOrientation.WEST);
        setGameBoardPigPosition(4, 4);
    }

}
