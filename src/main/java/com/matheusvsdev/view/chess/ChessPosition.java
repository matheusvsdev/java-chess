package com.matheusvsdev.view.chess;

import com.matheusvsdev.model.boardgame.PositionEntity;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Invalid chess position");
        }
        this.column = column;
        this.row = row;
    }

    protected PositionEntity toPosition() {
        return new PositionEntity(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(PositionEntity position) {
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
