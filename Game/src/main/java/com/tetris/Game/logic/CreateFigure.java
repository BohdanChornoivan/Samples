package com.tetris.Game.logic;

import com.tetris.Game.logic.data.Figure;
import com.tetris.Game.logic.data.StatusBlock;

import java.util.Random;

public class CreateFigure {

    public final int START_X = 0;
    public final int START_Y = 5;

    public Figure createRandom(String[][] board) {
        int rnd = new Random().nextInt(5);

        switch (rnd) {
            case 0:
                return T(board);
            case 1:
                return I(board);
            case 2:
                return L(board);
            case 3:
                return Q(board);
            default:
                return Z(board);
        }
    }

    public Figure T(String[][] board) {
        board[START_X][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X + 1][START_Y - 1] = StatusBlock.BUSY.getStatus();
        board[START_X + 1][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X + 1][START_Y + 1] = StatusBlock.BUSY.getStatus();

        return Figure.T;
    }

    public Figure I(String[][] board) {
        board[START_X][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X+1][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X+2][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X+3][START_Y] = StatusBlock.BUSY.getStatus();

        return Figure.I;
    }

    public Figure L(String[][] board) {
        board[START_X][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X][START_Y-1] = StatusBlock.BUSY.getStatus();
        board[START_X+1][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X+2][START_Y] = StatusBlock.BUSY.getStatus();

        return Figure.L;
    }

    public Figure Q(String[][] board) {
        board[START_X][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X][START_Y+1] = StatusBlock.BUSY.getStatus();
        board[START_X+1][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X+1][START_Y+1] = StatusBlock.BUSY.getStatus();

        return Figure.Q;
    }

    public Figure Z(String[][] board) {
        board[START_X][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X+1][START_Y] = StatusBlock.BUSY.getStatus();
        board[START_X+1][START_Y-1] = StatusBlock.BUSY.getStatus();
        board[START_X+2][START_Y-1] = StatusBlock.BUSY.getStatus();

        return Figure.Z;
    }
}
