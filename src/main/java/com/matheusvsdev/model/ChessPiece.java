package com.matheusvsdev.model;

import com.matheusvsdev.model.enums.Color;

public class ChessPiece extends PieceEntity {

    private Color color;

    public ChessPiece(BoardEntity board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
