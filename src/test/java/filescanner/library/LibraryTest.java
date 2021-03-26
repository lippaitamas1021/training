package filescanner.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testLoadFromFile() {
        Library library = new Library();
        library.loadFromFile();
        assertEquals(20, library.getBooks().size());
        assertEquals("Emily Steady", library.getBooks().get(2).getAuthor());
    }
}
