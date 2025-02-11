package com.matheusvsdev.model.boardgame;

public class PieceEntity {

    protected PositionEntity position;
    private BoardEntity board;

    public PieceEntity() {
    }

    public PieceEntity(BoardEntity board) {
        this.board = board;
    }

    protected BoardEntity getBoard() {
        return board;
    }
}
