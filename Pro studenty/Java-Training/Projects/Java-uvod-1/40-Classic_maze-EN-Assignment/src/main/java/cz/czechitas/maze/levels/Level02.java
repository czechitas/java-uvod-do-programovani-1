package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level02 {

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
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("This pig is ruffling my feathers. Help me to find him!");
        setGameBoardBirdPosition(2, 4, BirdOrientation.EAST);
        setGameBoardPigPosition(5, 4);
    }

}
