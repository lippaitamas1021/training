package interfaceextends.robot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void testCreatePoint() {
        Point point = new Point(2, 3, 4);
        assertEquals(2L, point.getX());
        assertEquals(3L, point.getY());
        assertEquals(4L, point.getZ());
    }
}
