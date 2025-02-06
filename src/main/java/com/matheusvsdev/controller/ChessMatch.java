package com.matheusvsdev.controller;

import com.matheusvsdev.model.boardgame.BoardEntity;
import com.matheusvsdev.model.boardgame.PositionEntity;
import com.matheusvsdev.view.chess.ChessPiece;
import com.matheusvsdev.view.chess.enums.Color;
import com.matheusvsdev.view.chess.pieces.King;
import com.matheusvsdev.view.chess.pieces.Rook;

public class ChessMatch {

    private BoardEntity board;

    public ChessMatch() {
        board = new BoardEntity(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new PositionEntity(2, 1));
        board.placePiece(new King(board, Color.BLACK), new PositionEntity(5, 1));
    }
}
