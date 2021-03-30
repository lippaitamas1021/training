package introinheritance.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        assertEquals("John Doe", employee.getName());
        assertEquals("1117 Budapest, Budafoki út 56.", employee.getAddress());
        assertEquals(300_000.0, employee.getSalary());
    }

    @Test
    public void testMigrateEmployee() {
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        employee.migrate("1117 Budapest, Budafoki út 100.");
        assertEquals("1117 Budapest, Budafoki út 100.", employee.getAddress());
    }

    @Test
    public void testRaiseSalary() {
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        employee.raiseSalary(10);
        assertEquals(330_000.0, employee.getSalary());
    }
}
