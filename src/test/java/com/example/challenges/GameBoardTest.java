package com.example.challenges;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @Test
    void equals() {

        boolean[][] data = {
                {
                    false
                }
        };
        GameBoard board1 = new GameBoard(data);
        boolean[][] data2 = {
                {
                        false
                }
        };
        GameBoard board2 = new GameBoard(data2);
        assertThat(board1, is(equalTo(board2)));
    }

    @Test
    void notEquals() {

        boolean[][] data = {
                {
                        false
                }
        };
        GameBoard board1 = new GameBoard(data);
        boolean[][] data2 = {
                {
                        true
                }
        };
        GameBoard board2 = new GameBoard(data2);
        assertThat(board1, is(not(equalTo(board2))));
    }

    @Test
    void equalsArrays() {

        boolean[][] data = {
                {
                        false, true
                }
        };
        GameBoard board1 = new GameBoard(data);
        boolean[][] data2 = {
                {
                        false, true
                }
        };
        GameBoard board2 = new GameBoard(data2);
        assertThat(board1, is(equalTo(board2)));
    }

    @Test
    void equalsMultiDimensions() {

        boolean[][] data = {
                {
                        false, true
                },
                {
                    true, false
                }
        };
        GameBoard board1 = new GameBoard(data);
        boolean[][] data2 = {
                {
                        false, true
                },
                {
                    true, false
                }

        };
        GameBoard board2 = new GameBoard(data2);
        assertThat(board1, is(equalTo(board2)));
    }

    @Test
    public void testGetNeighbours() {
        boolean[][] data = {
                {
                        true, false, true
                },
                {
                        true, false, true
                },
                {
                        true, false, true
                },
        };
        GameBoard gameBoard = new GameBoard(data);
        boolean[][] neighbours = gameBoard.getNeighbours(1,1);
        assertThat(neighbours.length, is(equalTo(3)));
        assertThat(neighbours[0].length, is(equalTo(3)));
        assertTrue(neighbours[0][0]);
        assertTrue(neighbours[0][0]);
    }
}