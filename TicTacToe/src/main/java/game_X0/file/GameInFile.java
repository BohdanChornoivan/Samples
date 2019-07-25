package game_X0.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GameInFile {

    public GameInFile createFile(String text) throws IOException {

        File file = new File("GameFile.txt");

        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }

        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
        return null;
    }
}
