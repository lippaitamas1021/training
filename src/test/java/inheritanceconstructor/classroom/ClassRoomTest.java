package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassRoomTest {

    @Test
    public void constructorTest() {
        ClassRoom classroom = new ClassRoom("122", 20, Facility.CHALKBOARD);
        assertEquals("122", classroom.getLocation());
        assertEquals(20, classroom.getCapacity());
        assertEquals(Facility.CHALKBOARD, classroom.getFacility());
    }

    @Test
    public void isSuitableSuccess() {
        ClassRoom classroom = new ClassRoom("122", 20, Facility.COMPUTERS);
        Course course = new Course(15, Facility.COMPUTERS);
        assertTrue(classroom.isSuitable(course));

    }

    @Test
    public void isSuitableFail() {
        ClassRoom classroom = new ClassRoom("122", 20, Facility.COMPUTERS);
        Course course = new Course(15, Facility.CHALKBOARD);
        assertFalse(classroom.isSuitable(course));
    }
}
