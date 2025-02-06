package com.matheusvsdev.model.boardgame;

public class BoardEntity {
    private int rows;
    private int columns;
    private PieceEntity[][] pieces;

    public BoardEntity(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Rows and columns must be greater than 0");
        }
        this.rows = rows;
        this.columns = columns;
        this.pieces = new PieceEntity[rows][columns];
    }

    public PieceEntity piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public PieceEntity piece(PositionEntity position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(PieceEntity piece, PositionEntity position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(PositionEntity position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(PositionEntity position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
