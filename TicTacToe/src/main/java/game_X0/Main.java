package game_X0;

import game_X0.file.GameInFile;
import game_X0.gamer.Player;
import game_X0.realization.MarksForBoard;
import game_X0.realization.RealizationGame;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        RealizationGame realizationGame = new RealizationGame();

        Player playerB1 = new Player("B1-X", MarksForBoard.MARK_X.getMark());

        Player playerB2 = new Player("B2-0", MarksForBoard.MARK_0.getMark());

        realizationGame.play(playerB1, playerB2);


        try {
            GameInFile gameInFile = new GameInFile();
            gameInFile.createFileInCVS(realizationGame);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
