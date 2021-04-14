package cz.czechitas.angrybirds.levels;

import cz.czechitas.angrybirds.api.*;

import static cz.czechitas.angrybirds.api.Commands.*;

public class Level01 {

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
                {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
                {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
                {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
                {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
                {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
                {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
                {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
                {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Can you help me to catch the naughty pig?\nProgram Red in editor commands for movement:\n\n    moveForward();\n\nThen hit \"Start\".");
        setGameBoardBirdPosition(3, 2, BirdOrientation.SOUTH);
        setGameBoardPigPosition(3, 4);
    }

}
