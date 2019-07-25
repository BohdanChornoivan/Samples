package game_X0.realization;


import game_X0.gamer.Player;

public class RealizationGame {

    private static final int maxSizeBoard = 3;

    private String[][] board_X0;

    private String winner;

    public String[][] getBoard_X0() {
        return board_X0;
    }

    public String getWinner() {
        return winner;
    }

    public RealizationGame() {

        this.board_X0 = new String[maxSizeBoard][maxSizeBoard];

        for (int i = 0; i < board_X0.length; i++) {
            for (int j = 0; j < board_X0[i].length; j++) {

                board_X0[i][j] = MarksForBoard.EMPTY.getMark();
            }
        }
    }

    public void play(Player player1, Player player2) {

        while (true) {

            if (checkIfWin(player1, player2)) {
                whoWin();
                return;
            }

            while (!movePlayer(player1)) {
                continue;
            }

            if (checkIfWin(player1, player2)) {
                whoWin();
                return;
            }

            while (!movePlayer(player2)) {
                continue;
            }
        }
    }

    private boolean checkStroke(int row, int column) {

        if (board_X0[row][column].equals(MarksForBoard.EMPTY.getMark())) {
            return true;
        } else
        return false;
    }


    public void printBoard() {
         for (int i = 0; i < board_X0.length; i++) {
            for (int j = 0; j < board_X0[i].length; j++) {
                System.out.print(board_X0[i][j] + "\t");
            }
             System.out.println(MarksForBoard.EMPTY.getMark());
        }
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

    public void whoWin() {

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

        int move1 = player.randomNumberOnTheBoard(board_X0);

        int move2 = player.randomNumberOnTheBoard(board_X0);

        if (checkStroke(move1, move2)) {
            board_X0[move1][move2] = String.valueOf(player.getMark());
            return true;
        } else
            return false;
    }
}
