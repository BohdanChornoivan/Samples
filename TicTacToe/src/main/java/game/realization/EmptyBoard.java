package game.realization;

public class EmptyBoard {

    protected String[][] createBoard(int maxSizeBoard) {

        String[][] board_X0 = new String[maxSizeBoard][maxSizeBoard];

        for (int i = 0; i < board_X0.length; i++) {
            for (int j = 0; j < board_X0[i].length; j++) {

                board_X0[i][j] = MarksForBoard.EMPTY.getMark();
            }
        }
        return board_X0;
    }
}
