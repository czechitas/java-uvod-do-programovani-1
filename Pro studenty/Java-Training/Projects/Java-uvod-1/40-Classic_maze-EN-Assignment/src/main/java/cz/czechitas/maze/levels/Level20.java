package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level20 {

    void run() {
        // TODO: Write a program for Red

        while (notFinished()) {
            if (isPathForward()) {
                // Add a command here
            } else {
                if (isPathRight()) {
                    // Add a command here
                } else {
                    // Add a command here
                }
            }
        }

        // Sample commands:
        // turnLeft();
        // turnRight();
        // moveForward();
        // while (notFinished()) {
        //     commands
        // }
        // if (isPathRight()) {
        //     commands
        // } else {
        //     otherwise these commands will be performed
        // }
        // if (isPathForward()) {
        //     commands
        // } else {
        //     otherwise these commands will be performed
        // }
        // if (isPathLeft()) {
        //     commands
        // } else {
        //     otherwise these commands will be performed
        // }
    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Can you solve the puzzle using just 3 commands (to the correct places \"Add a command here\")? Quickly! The pig is smirking!");
        setGameBoardBirdPosition(1, 6, BirdOrientation.NORTH);
        setGameBoardPigPosition(2, 1);
    }

}
