package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bands = new ArrayList<>();
    
    public void readBandsFromFile(Path inputFile) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(inputFile)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(";");
                String name = temp[0];
                int year = Integer.parseInt(temp[1]);
                bands.add(new Band(name, year));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read the file", ioe);
        }
    }

    public void writeBandsBefore(Path outputFile, int year) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(outputFile)) {
            for (Band band : bands) {
                if (band.getYear() < year) {
                    bufferedWriter.write(band + "\n");
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not write the file", ioe);
        }
    }

    public static void main(String[] args) {
        BandManager bandManager = new BandManager();
        bandManager.readBandsFromFile(Path.of("bands_and_years.txt"));
        System.out.println(bandManager.bands);
    }
}
