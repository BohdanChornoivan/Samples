package com.tetris.Game.logic;

import com.tetris.Game.logic.data.StatusBlock;

public class Board {

    private String[][] board;

    public Board(int row, int column) {

        board = new String[row][column];

        if(row > 0 || column > 0) {
            fillBoard();
        } else throw new RuntimeException();
    }


    private void fillBoard() {

        for (int i = 0; i < board.length; i++)  {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = StatusBlock.VOID.getStatus();
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }
}
