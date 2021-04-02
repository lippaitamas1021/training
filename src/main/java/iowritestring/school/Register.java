package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path file, int newMark) {
        try {
            if (!Files.exists(file)) {
            Files.writeString(file, String.valueOf(newMark));
        } else {
            Files.writeString(file, String.valueOf(newMark) + "\n", StandardOpenOption.APPEND);
        }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not write the file");
        }
    }

    public void average(Path file) {
        try {
            int sum = 0;
            List<String> avgTestList = Files.readAllLines(file);
            for (String s : avgTestList) {
                sum += Integer.parseInt(s);
            }
            Files.writeString(file, "average: " + (double) sum / avgTestList.size(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read the file", e);
        }
    }
}
