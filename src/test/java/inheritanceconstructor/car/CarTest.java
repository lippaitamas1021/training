package inheritanceconstructor.car;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    public void incorrectParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Car(5.0, 50.0, 40.0));
        assertEquals("Tank capacity is less than fuel!", ex.getMessage());
    }

    @Test
    public void testModifyFuelAmount() {
        Car car = new Car(5.0, 25.0, 40.0);
        car.modifyFuelAmount(-10.0);
        assertEquals(15.0, car.getFuel());
    }

    @Test
    public void testDrive() {
        Car car = new Car(5.0, 25.0, 40.0);
        car.drive(100);
        assertEquals(20.0, car.getFuel());
    }

    @Test
    public void notEnoughFuelShouldThrowException() throws RuntimeException {
        Car car = new Car(5.0, 25.0, 40.0);
        Exception ex = assertThrows(RuntimeException.class, () -> car.drive(600));
        assertEquals("Not enough fuel available!", ex.getMessage());
    }

    @Test
    public void testCalculateRefillAmount() {
        Car car = new Car(5.0, 25.0, 40.0);
        assertEquals(15.0, car.calculateRefillAmount());
    }
}
