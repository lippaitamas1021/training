package introinheritance.basket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemsTest {

    @Test
    public void testGetTaxAmount() {
        Item item = new Item("123456", 1000, 27);
        assertEquals(270L, Math.round(item.getTaxAmount()));
    }

    @Test
    public void testToString() {
        Item item = new Item("123456", 1000, 27);
        assertEquals("Item{barcode='123456', nettoPrice=1000.0, vatPercent=27}", item.toString());
    }
}
