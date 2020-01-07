package com.example.challenges;

import java.util.Arrays;

public class GameBoard {

    boolean[][] isAlive;

    public GameBoard(boolean[][] data) {
        this.isAlive = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameBoard)) return false;
        GameBoard gameBoard = (GameBoard) o;
        return Arrays.deepEquals(isAlive, gameBoard.isAlive);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(isAlive);
    }

    public boolean[][] getNeighbours(int x, int y) {
        boolean[][] neighbours = new boolean[3][3];
        neighbours[0][0] = isAlive[x - 1][y + 1];
        neighbours[0][1] = isAlive[x][y + 1];
        return neighbours;
    }

    /*void print() {
        boolean printing = false;
        for (int i = 0; i < alive.length; i++) {
            for (int j = 0; j < alive[i].length; j++) {
                if (alive[i][j] && !printing) {
                    printing = true;
                }

            }
        }
    }*/
}
