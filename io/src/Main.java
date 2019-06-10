import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String txtFile = "SimpleFile.txt";
        String text1 = "(S)(TRING|tring)";
        String text2 = "Sting Two";

        File file = new File(txtFile);

        if (!file.exists()) {
            try {
                file.createNewFile();
//                throw new IllegalArgumentException("File not found: " + file);
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        FindAndReplace fileFR = new FindAndReplace(file);

        try {
            fileFR.replace(text1, text2);
            fileFR.find(text1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
