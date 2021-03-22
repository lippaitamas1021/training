package controlselection.greetings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    @Test
    public void testGreet() {
        Greetings greetings = new Greetings();
        assertEquals("Jó éjt", greetings.greeter(4, 30));
        assertEquals("Jó éjt", greetings.greeter(5, 0));
        assertEquals("Jó reggelt", greetings.greeter(5, 1));
        assertEquals("Jó reggelt", greetings.greeter(9, 0));
        assertEquals("Jó napot", greetings.greeter(9, 1));
        assertEquals("Jó napot", greetings.greeter(18, 30));
        assertEquals("Jó estét", greetings.greeter(18, 31));
        assertEquals("Jó estét", greetings.greeter(20, 0));
        assertEquals("Jó éjt", greetings.greeter(20, 1));
    }
}
