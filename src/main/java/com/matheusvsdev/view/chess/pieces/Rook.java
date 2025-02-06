package com.matheusvsdev.view.chess.pieces;

import com.matheusvsdev.model.boardgame.BoardEntity;
import com.matheusvsdev.view.chess.ChessPiece;
import com.matheusvsdev.view.chess.enums.Color;

public class Rook extends ChessPiece {

    public Rook(BoardEntity board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }
}
