package com.matheusvsdev;

import com.matheusvsdev.view.chess.ChessMatch;
import com.matheusvsdev.view.UI;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}