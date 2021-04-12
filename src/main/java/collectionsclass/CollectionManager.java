package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(this.library);
    }

    public List<Book> reverseLibrary() {
        List<Book> reversedList = new ArrayList<>(library);
        Collections.sort(reversedList);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public Book getFirstBook() {
        Collections.sort(new ArrayList<Book>(library));
        return library.get(0);
    }

    public Book getLastBook() {
        Collections.sort(new ArrayList<Book>(library));
        return library.get(library.size() - 1);
    }
}
