package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> names;

    public SalaryWriter(List<String> names) {
        this.names = new ArrayList<>(names);
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String name : names) {
                if (name.contains("Dr")) {
                    printWriter.print(name);
                    printWriter.print(": ");
                    printWriter.println(500_000);
                } else if (name.contains("Mrs")) {
                    printWriter.print(name);
                    printWriter.print(": ");
                    printWriter.println(200_000);
                } else {
                    printWriter.print(name);
                    printWriter.print(": ");
                    printWriter.println(100_000);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not print the file", ioe);
        }
    }
}
