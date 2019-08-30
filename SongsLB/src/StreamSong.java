import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;


@SuppressWarnings("ALL")
public class StreamSong {

    public static void main(String[] args) throws IOException {


        Set<String> trash = new HashSet<String>(Arrays.asList("", ",", ".", "!", "'", "?", "(", ")", "[", "]"));

        Files.list(Paths.get("./Limp Bizkit"))
                .filter(Files::isRegularFile)
                .map(Path::toUri)
                .flatMap(line -> {
                    try {
                        return Files.lines(Paths.get(line));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } return null;
                })
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .map(String::toLowerCase)
                .filter(s1 -> !trash.contains(s1))
                .collect(LinkedHashMap::new,
                        (map, str) -> map.merge(str, 1, (o, o2) ->
                                (Integer) o + (Integer) o2), (map, map2) -> { })
                .entrySet().stream()
                .sorted(((o1, o2) -> (Integer) o2.getValue() - (Integer) o1.getValue()))
                .forEach(System.out::println);

    }
}

