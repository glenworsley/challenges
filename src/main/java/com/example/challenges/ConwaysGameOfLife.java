package com.example.challenges;

import java.awt.*;
import java.util.ArrayList;

public class ConwaysGameOfLife {

    /**
     * "Play" the game, given the initial board, returning a new board with the new state.
     * @param gameBoard
     * @return
     */
    public GameBoard play(GameBoard gameBoard) {
        //do nothing - yet!
        ArrayList<Point> livePoints = new ArrayList<>();
        livePoints.add(new Point(1,0));
        livePoints.add(new Point(2,0));
        livePoints.add(new Point(2, 1));
        GameBoard resultBoard = new GameBoard(livePoints);
        return resultBoard;
    }

    /*
     * traverse the given board.
     * For each cell, if cell is live & cell has less than 2 live neighbours, cell dies.
     * @param gameBoard
     * @return
     */
 /*   private GameBoard applyRule1(GameBoard gameBoard) {

        boolean[][] data = new boolean[gameBoard.isAlive.length][gameBoard.isAlive.length];  //TODO: assumes board is square!
        for (int i = 0; i < gameBoard.isAlive.length; i++) {
            for (int j = 0; j < gameBoard.isAlive[i].length; j++) {
                data[i][j] = gameBoard.isAlive[i][j] && hasAtLeastTwoLiveNeighbors(gameBoard, i, j);
            }
        }
        return new GameBoard(data);
    }

    private boolean hasAtLeastTwoLiveNeighbors(GameBoard gameBoard, int i, int j) {
        int liveNeighbors = 0;
        boolean neighbourAbove = gameBoard.isAlive[i][j+1];
        return false;

    }*/


}
