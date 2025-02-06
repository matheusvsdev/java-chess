package com.matheusvsdev.view.chess;

import com.matheusvsdev.model.boardgame.BoardEntity;
import com.matheusvsdev.model.boardgame.PieceEntity;
import com.matheusvsdev.view.chess.enums.Color;

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
