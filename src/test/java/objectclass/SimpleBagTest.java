package objectclass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleBagTest {

    @Test
    public void testConstructor() {
        SimpleBag bag = new SimpleBag();
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.size());
    }

    @Test
    public void testPut() {
        SimpleBag bag = new SimpleBag();
        bag.putItem("alma");
        bag.putItem((new Book("Rejtő Jenő", "Az ellopott cirkáló")));
        bag.putItem(new Beer("Borsodi", 239));
        assertFalse(bag.isEmpty());
        assertEquals(3, bag.size());
    }

    @Test
    public void testIteration() {
        SimpleBag bag = new SimpleBag();
        bag.putItem(new Beer("Heineken", 250));
        bag.putItem(new Book("Rejtő Jenő", "Az ellopott cirkáló"));
        bag.putItem(new Beer("Borsodi", 239));
        while (bag.hasNext()) {
            assertTrue(bag.next().getClass().toString().contains("objectclass.B"));
        }
        assertEquals(2, bag.getCursor());
    }

    @Test
    public void testContains() {
        SimpleBag bag = new SimpleBag();
        bag.putItem(new Beer("Borsodi", 239));
        bag.putItem(new Book("Rejtő Jenő", "Az ellopott cirkáló"));
        assertTrue(bag.contains(new Beer("Borsodi", 239)));
        assertTrue(bag.contains(new Book("Rejtő Jenő", "Az ellopott cirkáló")));
        assertFalse(bag.contains(new Book("Rejtő Jenő", "A megkerült cirkáló")));
    }
}
