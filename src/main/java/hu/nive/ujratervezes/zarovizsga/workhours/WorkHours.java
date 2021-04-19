package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {

    List<Work> works = new ArrayList<>();

    public String minWork(String file) {
        StringBuilder stringBuilder = new StringBuilder();
        String ownerOfMinWork = null;
        int minHour = 100;
        String dateOfMinWork = null;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                String name = temp[0];
                int numberOfWork = Integer.parseInt(temp[1]);
                String date = temp[2];
                works.add(new Work(name, numberOfWork, date));
                for (Work work : works) {
                    if (work.getNumberOfHours() < minHour) {
                        ownerOfMinWork = work.getName();
                        minHour = work.getNumberOfHours();
                        dateOfMinWork = work.getDate();
                    }
                }
            }
            stringBuilder.append(ownerOfMinWork);
            stringBuilder.append(": ");
            stringBuilder.append(dateOfMinWork);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read the file", ioe);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        WorkHours workHours = new WorkHours();
        workHours.minWork("/src/test/resources/hu.nive.ujratervezes.zarovizsga/workhours/workhours.txt");
    }
}
