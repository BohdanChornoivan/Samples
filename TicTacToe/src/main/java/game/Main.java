package game;

import game.file.SaveCvsFile;
import game.gamer.Player;
import game.realization.MarksForBoard;
import game.realization.RealizationGame;

public class Main {

    public static void main(String[] args) {

        RealizationGame realizationGame = new RealizationGame();

        Player playerB1 = new Player("B1-X", MarksForBoard.MARK_X.getMark());

        Player playerB2 = new Player("C2-0", MarksForBoard.MARK_0.getMark());

        realizationGame.play(playerB1, playerB2);

        SaveCvsFile saveCvsFile = new SaveCvsFile();
        saveCvsFile.createFileInCVS(realizationGame);

    }
}
