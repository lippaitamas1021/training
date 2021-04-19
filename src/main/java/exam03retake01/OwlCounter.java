package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owls = new HashMap<>();

    public void readFromFile(BufferedReader reader) {
        try {
            String line;
            while((line = reader.readLine()) != null) {
                String[] temp = line.split("=");
                String county = temp[0];
                int numberOfOwls = Integer.parseInt(temp[1]);
                owls.put(county, numberOfOwls);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read the file", e);
        }
    }

    public int getNumberOfOwls(String county) {
        return owls.get(county);
    }
}
