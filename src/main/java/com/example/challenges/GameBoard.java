package com.example.challenges;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class GameBoard {

    private List<Point> livePoints;

    public GameBoard(List<Point> livePoints) {
        this.livePoints = livePoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameBoard)) return false;
        GameBoard gameBoard = (GameBoard) o;
        return Objects.equals(livePoints, gameBoard.livePoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livePoints);
    }
}
