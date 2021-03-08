package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> bookTitles = new ArrayList<>();

    public void add(String bookTitle) {
        bookTitles.add(bookTitle);
    }

    public List<String> getBookTitles() {
        return bookTitles;
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < bookTitles.size(); i++) {
            if (bookTitles.get(i).startsWith(prefix)) {
                result.add(bookTitles.get(i));
            }
        }
        return result;
    }

    public void removeByPrefix(String prefix) {
        for (int i = 0; i < bookTitles.size(); i++) {
            if (bookTitles.get(i).startsWith(prefix)) {
                bookTitles.remove(bookTitles.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("Clean Code");
        books.add("Effective JAVA");
        System.out.println(books.getBookTitles());
        System.out.println(books.findAllByPrefix("Clean"));

    }
}
