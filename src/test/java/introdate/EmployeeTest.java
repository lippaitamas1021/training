package introdate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getName() {
        Employee employee = new Employee(1984,10,21, "Lippai Tamás");
        assertEquals("Lippai Tamás", employee.getName());
    }
}