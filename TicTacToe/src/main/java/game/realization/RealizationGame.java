package game.realization;


import game.gamer.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class RealizationGame {

    private static final int maxSizeBoard = 3;

    private String[][] board_X0;

    private String namePlayer1;

    private String namePlayer2;

    private String winner;

    private ArrayList<String> saveMoves;

    private GameControl control = new GameControl();


    public RealizationGame() {

        board_X0 = new EmptyBoard().createBoard(maxSizeBoard);

        saveMoves = new ArrayList<>();



    }

    public void play(Player player1, Player player2) {

        this.namePlayer1 = player1.getName();
        this.namePlayer2 = player2.getName();

        playersMove(player1, player2);

    }

    private void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < board_X0.length; i++) {
            for (int j = 0; j < board_X0[i].length; j++) {
                System.out.print(board_X0[i][j] + "\t");
            }
            System.out.println(MarksForBoard.EMPTY.getMark());
        }
        System.out.println("---------");
    }

    private void playersMove(Player player1, Player player2) {

        while (true) {

            if (checkIfWin(player1, player2)) {
                whoWin();
                return;
            }

            while (!movePlayer(player1)) {
                System.out.println("String is busy");
                continue;
            }

            printBoard();

            if (checkIfWin(player1, player2)) {
                whoWin();
                return;
            }

            while (!movePlayer(player2)) {
                System.out.println("String is busy");
                continue;
            }

            printBoard();
        }
    }

    private boolean checkEmptyStroke(int row, int column) {

        if (board_X0[row][column].equals(MarksForBoard.EMPTY.getMark())) {
            return true;
        } else
        return false;
    }


    private boolean checkIfWin(Player player1, Player player2) {

        int checkFullBoard = 0;

        for (int i = 0; i < board_X0.length; i++) {
            for (int j = 0; j < board_X0[i].length; j++) {
                if(!(board_X0[i][j].equals(MarksForBoard.EMPTY.getMark()))) {
                    checkFullBoard += 1;
                }
            }
        }

        if(checkBoard(player1)) {
            winner = player1.getName();
            return true;
        } else if (checkBoard(player2)) {
            winner = player2.getName();
            return true;
        } else if (checkFullBoard == 9) {
            winner = "Nobody won";
            return true;
        } else {
            return false;
        }
    }

    private void whoWin() {

        if(!(winner == null)) {
            System.out.println("Winner = " + winner);
        } else
            System.out.println("Nobody won");
    }

    private boolean checkBoard(Player player) {

        for (int i = 0; i < board_X0.length; i++) {
            if (board_X0[0][i].equals(player.getMark()) && board_X0[1][i].equals(player.getMark()) && board_X0[2][i].equals(player.getMark())) {
                winner = player.getName();
                return true;
            }
            if (board_X0[i][0].equals(player.getMark()) && board_X0[i][1].equals(player.getMark()) && board_X0[i][2].equals(player.getMark())) {
                winner = player.getName();
                return true;
            }
        }

        if (board_X0[0][0].equals(player.getMark()) && board_X0[1][1].equals(player.getMark()) && board_X0[2][2].equals(player.getMark())) {
            winner = player.getName();
            return true;
        }

        if (board_X0[0][2].equals(player.getMark()) && board_X0[1][1].equals(player.getMark()) && board_X0[2][0].equals(player.getMark())) {
            winner = player.getName();
            return true;
        }

        return false;
    }

    private boolean movePlayer(Player player) {


        int writeRow = control.enterRow(player);

        int writeColumn = control.enterColumn(player);

        if (writeRow >= board_X0.length || writeColumn >= board_X0.length) {
            System.out.println("You have entered a large value");
            return false;
        } else if (checkEmptyStroke(writeRow, writeColumn)) {
            board_X0[writeRow][writeColumn] = player.getMark();
            saveMoves.add(player.getName() + " = " + writeRow + ", " + writeColumn);
            return true;
        } else
            return false;
    }

    public String[][] getBoard_X0() {
        return board_X0;
    }

    public String getWinner() {
        return winner;
    }

    public ArrayList<String> getSaveMoves() {
        return saveMoves;
    }

    public String getNamePlayer1() {
        return namePlayer1;
    }

    public String getNamePlayer2() {
        return namePlayer2;
    }
}
