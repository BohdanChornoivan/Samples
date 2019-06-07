import java.io.*;

public class IoFile {
    public static void main(String[] args) {

        String txtFile = "SimpleFile.txt";
        BufferedReader br = null;

        try {
            File file = new File(txtFile);

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Program ");
            pw.println("works ");
            pw.println("good");
            pw.close();

            br = new BufferedReader(new FileReader(txtFile));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
