package com.tetris.Game.logic;


import com.tetris.Game.logic.data.Figure;
import com.tetris.Game.logic.data.StatusBlock;

public class InteractionFigure implements ControlGame{

    private String block;
    private String[][] board;
    private Figure figure;
    private int rotate;
    private boolean where;

    public InteractionFigure(String[][] board, Figure figure) {
        block = StatusBlock.BUSY.getStatus();
        this.board = board;
        this.figure = figure;
        rotate = 0;
    }


    @Override
    public void turn_left(int center_x, int center_y) {

        rotate++;

        if(rotate >= 2) {
            rotate = 1;
        }

        where = false;

        switch (figure) {
            case T:
                actionT(center_x, center_y);
                break;
            case I:
                actionI(center_x, center_y);
                break;
            case L:
                actionL(center_x, center_y);
                break;
            case Q:
                actionQ(center_x, center_y);
                break;
            case Z:
                actionZ(center_x, center_y);
                break;
        }

    }

    @Override
    public void turn_right(int center_x, int center_y) {

        rotate++;

        if(rotate > 2) {
            rotate = 1;
        }

        where = true;

        switch (figure) {
            case T:
                actionT(center_x, center_y);
                break;
            case I:
                actionI(center_x, center_y);
                break;
            case L:
                actionL(center_x, center_y);
                break;
            case Q:
                actionQ(center_x, center_y);
                break;
            case Z:
                actionZ(center_x, center_y);
                break;
        }

    }



    @Override
    public void move_left(int x, int y) {

    }

    @Override
    public void move_right(int x, int y) {

    }

    @Override
    public void down(int x, int y) {

    }

    @Override
    public void full_down(int x, int y) {

    }


    private void actionZ(int x, int y) {


        for (int i = 0; i < board.length; i++)  {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = StatusBlock.VOID.getStatus();
            }
        }

        if (rotate == 1 && !where) {

            board[x][y] = block;
            board[x][y-1] = block;
            board[x+1][y] = block;
            board[x+1][y+1] = block;

        }

        if (rotate == 1 && where) {

            board[x][y] = block;
            board[x][y-1] = block;
            board[x+1][y] = block;
            board[x+1][y+1] = block;

        }

        if(rotate == 0) {

            board[x][y] = block;
            board[x+1][y] = block;
            board[x+1][y-1] = block;
            board[x+2][y-1] = block;
        }

        if(rotate == 2) {

            board[x][y] = block;
            board[x+1][y] = block;
            board[x+1][y-1] = block;
            board[x+2][y-1] = block;

        }

    }

    private void actionQ(int x, int y) {

    }

    private void actionL(int x, int y) {

        for (int i = 0; i < board.length; i++)  {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = StatusBlock.VOID.getStatus();
            }
        }

        if (rotate == 1 && !where) {

            board[x][y] = block;
            board[x+1][y] = block;
            board[x+1][y-1] = block;
            board[x+1][y-2] = block;

        }

        if (rotate == 1 && where) {

            board[x][y] = block;
            board[x][y+1] = block;
            board[x][y+2] = block;
            board[x+1][y] = block;

        }

        if(rotate == 0) {

            board[x][y] = block;
            board[x][y-1] = block;
            board[x+1][y] = block;
            board[x+2][y] = block;
        }

        if(rotate == 2) {

            board[x][y] = block;
            board[x+1][y] = block;
            board[x+2][y] = block;
            board[x+2][y+1] = block;
        }

    }

    private void actionI(int x, int y) {

        for (int i = 0; i < board.length; i++)  {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = StatusBlock.VOID.getStatus();
            }
        }

        if (rotate == 1 && !where) {

            board[x][y] = block;
            board[x][y+1] = block;
            board[x][y+2] = block;
            board[x][y+3] = block;

        }

        if (rotate == 1 && where) {

            board[x][y] = block;
            board[x][y-1] = block;
            board[x][y-2] = block;
            board[x][y-3] = block;

        }

        if(rotate == 0) {

            board[x][y] = block;
            board[x+1][y] = block;
            board[x+2][y] = block;
            board[x+3][y] = block;
        }

        if(rotate == 2) {

            board[x][y] = block;
            board[x+1][y] = block;
            board[x+2][y] = block;
            board[x+3][y] = block;
        }

    }

    private void actionT(int x, int y) {

        for (int i = 0; i < board.length; i++)  {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = StatusBlock.VOID.getStatus();
            }
        }

        if (rotate == 1 && !where) {

            board[x+1][y] = block;
            board[x][y-1] = block;
            board[x+1][y-1] = block;
            board[x+2][y-1] = block;
        }

        if (rotate == 1 && where) {

            board[x+1][y] = block;
            board[x][y+1] = block;
            board[x+1][y+1] = block;
            board[x+2][y+1] = block;
        }

        if(rotate == 0) {

            board[x][y] = block;
            board[x+1][y-1] = block;
            board[x+1][y] = block;
            board[x+1][y+1] = block;
        }

        if(rotate == 2) {

            board[x][y-1] = block;
            board[x][y] = block;
            board[x][y+1] = block;
            board[x+1][y] = block;
        }

    }


}
