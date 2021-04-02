package ioreadstring.names;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private String fileName;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public Path getPath() {
        return Path.of(fileName);
    }

    public void readFromFile() {
        try (BufferedReader bufferedReader = Files.newBufferedReader(getPath())) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(" ");
                String firstName = temp[0];
                String lastName = temp[1];
                humans.add(new Human(firstName, lastName));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read the file", e);
        }
    }

    public List<Human> getHumans() {
        return humans;
    }
}
