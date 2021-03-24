package controliteration.pi;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PiGenerator {

    public List<String> words = new ArrayList<>();

    public String getPi() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> lengthOfWords = new ArrayList<>();
        Path path = Path.of("pi.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                for (String s : line.split(" ")) {
                    words.add(s);
                }
            }
            for (String word : words) {
               lengthOfWords.add(word.length());
                }
            stringBuilder.append(lengthOfWords.get(0));
            stringBuilder.append(".");
            for (int i = 1; i < lengthOfWords.size(); i++) {
                stringBuilder.append(lengthOfWords.get(i));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed at reading");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        PiGenerator pg = new PiGenerator();
        System.out.println(pg.getPi());
    }
}
