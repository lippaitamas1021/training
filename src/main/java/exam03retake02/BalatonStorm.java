package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.*;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) {
        List<String> result = new ArrayList<>();
        try {
            String station = null;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("allomas")) {
                    String[] temp = line.split(":");
                    station = temp[1].substring(2, temp[1].length()-2);
                }
                if (isStorm(line)) {
                    result.add(station);
                }
            }
            } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read the file", ioe);
        }
        Collections.sort(result, Collator.getInstance(new Locale("hu", "HU")));
        return result;
    }

    private boolean isStorm(String line) {
        return line.contains("\"level\": 3,");
    }
}

