package cz.czechitas.maze.levels;

import cz.czechitas.maze.api.*;

import static cz.czechitas.maze.api.Commands.*;

public class Level16 {

    void run() {
        // TODO: Sem vepiste program pro Reda

        // Prikazy k pouziti:
        // turnLeft();
        // turnRight();
        // moveForward();
        // while (notFinished()) {
        //     prikazy
        // }
        // if (isPathForward()) {
        //     prikazy
        // }
        // if (isPathRight()) {
        //     prikazy
        // }
        // if (isPathLeft()) {
        //     prikazy
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
        setGameBoardChallengeText("Prase! Prase! Prase! Použijte příkaz   if ()   ... abyste mě k němu dostali s pomocí maximálně 4 příkazů.");
        setGameBoardPlayerPosition(6, 1, PlayerOrientation.WEST);
        setGameBoardEnemyPosition(4, 4);
    }

}
