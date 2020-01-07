package com.example.challenges;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConwaysGameOfLifeTest {

    /**
     * Rule1: Any live cell with less than two live neighbours dies.
     * This test will execute the game with only this rule implemented, for a single step (tick) only.
     */
    @Test
    void playWithRuleOneOnly() {

        ConwaysGameOfLife game = new ConwaysGameOfLife();
        //int steps = 1;
        //true indicates the cell is alive, false - it is dead.
        List<Point> liveCells = new ArrayList<>();
        liveCells.add(new Point(0,0));
        liveCells.add(new Point(1,0));
        liveCells.add(new Point(2,0));
        liveCells.add(new Point(2, 1));
        liveCells.add(new Point(2, 2));
        liveCells.add(new Point(0, 3));
        GameBoard gameBoard = new GameBoard(liveCells);

        List<Point> expectedLiveCells = new ArrayList<>();
        expectedLiveCells.add(new Point(1,0));
        expectedLiveCells.add(new Point(2,0));
        expectedLiveCells.add(new Point(2, 1));
        GameBoard expectedGameBoard = new GameBoard(expectedLiveCells);

        GameBoard result = game.play(gameBoard);

        assertEquals(expectedGameBoard, result);
    }
}