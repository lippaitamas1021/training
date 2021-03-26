package filescanner.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void loadFromFile() {
        String fileName = "books.csv";
        try (Scanner scanner = new Scanner(Library.class.getResourceAsStream("/" + fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] temp = line.split(";");
                int registrationNumber = Integer.parseInt(temp[0]);
                String author = temp[1];
                String title = temp[2];
                int year = Integer.parseInt(temp[3]);
                books.add(new Book(registrationNumber, author, title, year));
            }
        }
    }
}

