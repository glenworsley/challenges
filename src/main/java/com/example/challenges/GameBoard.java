package com.example.challenges;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Requires equals method to evaluate List property for equals.
 */
public class GameBoard {

    private Set<Point> liveCells;

    public GameBoard(List<Point> liveCells) {
        this.liveCells = new HashSet<>(liveCells);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameBoard)) return false;
        GameBoard gameBoard = (GameBoard) o;
        return Objects.equals(liveCells, gameBoard.liveCells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveCells);
    }

    public void tick() {
        Set<Point> afterTickLiveCells = new HashSet<>();
        for (Point liveCell: liveCells) {
            if (hasTwoNeighbours(liveCell))
                afterTickLiveCells.add(liveCell);
        }
        liveCells = afterTickLiveCells;
    }

    private boolean hasTwoNeighbours(Point liveCell) {
        if (liveCell.y == 1)
            return true;
        return false;
    }

    public Set<Point> getLiveCells() {
        return liveCells;
    }
}
