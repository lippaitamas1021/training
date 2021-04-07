package collectionsequalshash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searchedBook = null;
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                searchedBook = book;
            }
        }
        return searchedBook;
    }

    public Book findBook(List<Book> books, Book searchingFor) {
        Book result = null;
        for (Book book : books) {
            if (book.equals(searchingFor)) {
                result = book;
            }
        }
        return result;
    }

    public Set<Book> addBooksToSet(Book[] sameBooks) {
        Set<Book> result = new HashSet<>();
        for (Book book : sameBooks) {
            result.add(book);
        }
        return result;
    }
}
