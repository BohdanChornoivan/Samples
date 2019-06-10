import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplace implements TextIO<String, String> {

    private final File file;

    public FindAndReplace(File file) {
        this.file = file;
    }


    @Override
    public void find(String text) throws IOException {
        Pattern pattern = Pattern.compile(text);

        BufferedReader br = new BufferedReader(new FileReader(file));

        try(br) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                boolean foundSubstring = matcher.find();
                System.out.println(line);
                if (foundSubstring) {
                    System.out.println(line);
                }
            }
        }
    }

    @Override
    public void replace(String text1, String text2) throws IOException {
        Pattern pattern = Pattern.compile(text1);
        StringBuilder stringBuilder = new StringBuilder();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));


        try(bufferedWriter) {
            bufferedWriter.write(text1);
            bufferedWriter.newLine();
            bufferedWriter.write(text2);
        }

        try(bufferedReader) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(System.lineSeparator());
                }
                Matcher matcher = pattern.matcher(line);
                boolean foundSubstring  = matcher.find();
                if (foundSubstring) {
                    String modified = matcher.replaceAll(text2);
                    System.out.println(modified);
                    stringBuilder.append(modified);
                } else {
                    stringBuilder.append(line);
                }
            }
        }

        Writer writer = new FileWriter(file);

        try(writer) {
            writer.write(stringBuilder.toString());
        }

    }
}

/*Программа принимает три входных параметра:
P - путь к файлу
S1 - строка
S2 - строка (опциональный параметр)

Если S2 не задан - вывести все строки в файле P, которые содержат в себе S1 (строки разделены символами переноса строки, см. System.lineSeparator())

Если S2 задан - заменить все вхождения S1 на S2, записать изменения на диск и вывести строки P, в которых произошла замена

Доп. задание: S1 может быть в формате Java RegEx

"%1d "

//            StringBuffer inputBuffer = new StringBuffer();
//            String inputStr = inputBuffer.toString();

//            if (text2.equals("")) {
//                inputStr = inputStr.replace(text1, text2);
//            }
//
//            System.out.println(inputStr);
//
//            FileOutputStream fileOut = new FileOutputStream(filePath);
//            fileOut.write(inputStr.getBytes());
//
//            System.out.println(inputStr);
//
//            fileOut.close();
*/
