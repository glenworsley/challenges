package com.example.challenges;

import java.awt.*;
import java.util.List;

public class ConwaysGameOfLife {

    /**
     * "Play" the game, given the initial board, returning a new board with the new state.
     */
    public GameBoard play(List<Point> initialLiveCells) {
        GameBoard board = new GameBoard(initialLiveCells);
        board.tick();
        return board;
    }

}
