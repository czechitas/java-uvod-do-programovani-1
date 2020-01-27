package cz.czechitas.angrybirds.levels;

import cz.czechitas.angrybirds.api.*;

import static cz.czechitas.angrybirds.api.Commands.*;

public class Level08 {

    void run() {
        // TODO: Sem vepiste program pro Reda

        // Zkus použít více než jeden blok "for".
        // for (int count = 0; count < 4; count++) {
        //     prikazy
        // }
        // for (int count2 = 0; count2 < 5; count2++) {
        //     prikazy
        // }

        // Prikazy k pouziti:
        // turnLeft();
        // turnRight();
        // moveForward();
    }

    //-------------------------------------------------------------------------

    void setupGameBoard() {
        Cell[][] cells = {
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.WOODEN_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.EMPTY, Cell.WOODEN_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.WOODEN_BOX, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.GLASS_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.EMPTY, Cell.STONE_BOX},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.GLASS_TRIANGLE, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.STONE_TRIANGLE, Cell.EMPTY, Cell.WOODEN_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_TRIANGLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.STONE_TRIANGLE},
            {Cell.WOODEN_BOX, Cell.WOODEN_BOX, Cell.STONE_BOX, Cell.GLASS_TRIANGLE, Cell.WOODEN_TRIANGLE, Cell.STONE_BOX, Cell.STONE_TRIANGLE, Cell.WOODEN_BOX}
        };
        setGameBoardCells(cells);
        setGameBoardChallengeText("Pomozte mi se zbavit toho zlobivého prasete pomocí 5 příkazů. Cyklus   for ()   se dá vnořit do jiného cyklu   for ()");
        setGameBoardBirdPosition(2, 6, BirdOrientation.EAST);
        setGameBoardPigPosition(6, 1);
    }

}
