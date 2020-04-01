package com.example.challenges;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameBoardTest {


    @Test
    public void tickSingleLiveCell() {

        List<Point> liveCells = new ArrayList<>();
        liveCells.add(new Point(0,0));
        GameBoard board = new GameBoard(liveCells);
        assertNotNull(board);
        board.tick();
        assertTrue(board.getLiveCells().isEmpty());
    }

    @Test
    public void tickTwoLiveCells() {

        List<Point> liveCells = new ArrayList<>();
        liveCells.add(new Point(0,0));
        liveCells.add(new Point(0,1));
        GameBoard board = new GameBoard(liveCells);
        assertNotNull(board);
        board.tick();
        assertTrue(board.getLiveCells().isEmpty());
    }

    @Test
    public void tickThreeLiveCells() {

        List<Point> liveCells = new ArrayList<>();
        liveCells.add(new Point(0,0));
        liveCells.add(new Point(0,1));
        liveCells.add(new Point(0,2));
        GameBoard board = new GameBoard(liveCells);
        assertNotNull(board);
        board.tick();
        assertTrue(board.getLiveCells().size() == 1);
    }


}