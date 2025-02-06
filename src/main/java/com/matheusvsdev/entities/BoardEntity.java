package com.matheusvsdev.entities;

public class BoardEntity {
    private int rows;
    private int columns;
    private PieceEntity[][] pieces;

    public BoardEntity(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new PieceEntity[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
