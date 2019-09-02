package com.tetris.Game;

import com.tetris.Game.logic.Board;
import com.tetris.Game.logic.CreateFigure;
import com.tetris.Game.logic.InteractionFigure;

public class Test {
    public static void main(String[] args) {

        Board board = new Board(20, 11);
        CreateFigure createFigure = new CreateFigure();
        InteractionFigure interactionFigure = new InteractionFigure(board.getBoard(), createFigure.Z(board.getBoard()));

        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard()[i].length; j++) {
                System.out.print(board.getBoard()[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        interactionFigure.turn_right(createFigure.START_X, createFigure.START_Y);
        interactionFigure.turn_right(createFigure.START_X, createFigure.START_Y);
        interactionFigure.turn_right(createFigure.START_X, createFigure.START_Y);

        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard()[i].length; j++) {
                System.out.print(board.getBoard()[i][j]);
            }
            System.out.println();
        }
    }
}
