package game_X0.file;

import game_X0.realization.RealizationGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class GameInFile {

    public void createFileInCVS(RealizationGame game) throws IOException {
        try (PrintWriter writer = new PrintWriter(new File("CSVGameFile.cvs"))) {

            StringBuilder sb = new StringBuilder();
//            String[] header = { "ID", "Name", "Address", "Phone Number" };
//            sb.append(header);
            sb.append("player");
            sb.append(',');
            sb.append("x");
            sb.append(',');
            sb.append("y");
            sb.append('\n');

            sb.append(game.getNamePlayer1());
            sb.append(',');
            sb.append(game.getBoard_X0()[0][1]);
            sb.append(',');
            sb.append(game.getBoard_X0().length);
            sb.append('\n');

            sb.append(game.getNamePlayer2());
            sb.append(',');
            sb.append(game.getBoard_X0()[0][1]);
            sb.append(',');
            sb.append(game.getBoard_X0().length);
            sb.append('\n');

            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
