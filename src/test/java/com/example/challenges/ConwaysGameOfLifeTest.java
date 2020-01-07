package com.example.challenges;

import org.junit.jupiter.api.Test;

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
        int steps = 1;
        //true indicates the cell is alive, false - it is dead.
        boolean[][] data = {
                {
                    true, false, false, false
                },
                {
                    false, false, true, false
                },
                {
                    false, false, true, false
                },
                {
                    true, true, true, false
                },
        };
        GameBoard gameBoard = new GameBoard(data);
        GameBoard result = game.play(gameBoard);
        boolean[][] expectedResultAfterOneStep = {
                {
                        false, false, false, false
                },
                {
                        false, false, false, false
                },
                {
                        false, false, true, false
                },
                {
                        false, true, true, false
                },
        };
        GameBoard expectedStepOneResult = new GameBoard(expectedResultAfterOneStep);
        assertEquals(expectedStepOneResult, result);
    }
}