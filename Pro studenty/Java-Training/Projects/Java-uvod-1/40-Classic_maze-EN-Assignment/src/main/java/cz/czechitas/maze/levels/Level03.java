package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level03 {

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
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.GLASS_TRIANGLE, Cell.STONE_TRIANGLE, Cell.TNT, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.TNT, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Fidn the way to the bloody Pig! Avoid TNT or the feathers will fly!");
        setGameBoardBirdPosition(2, 3, BirdOrientation.EAST);
        setGameBoardPigPosition(4, 4);
    }

}
