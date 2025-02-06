package com.matheusvsdev.entities;

public class PositionEntity {

    private int row;
    private int column;

    public PositionEntity(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int line) {
        this.row = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Linha = " + row +
                "| Coluna= " + column;
    }
}
