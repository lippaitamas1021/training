package inheritancemethods.products;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void constructorTest3Parameters() {
        BigDecimal unit = new BigDecimal("0.235");
        Product product = new Product("Ipad", unit, 3);
        assertEquals("Ipad", product.getName());
        assertEquals(unit, product.getUnitWeight());
        assertEquals(3, product.getNumberOfDecimals());
    }

    @Test
    public void constructorTest2Parameters() {
        BigDecimal unit = new BigDecimal("0.235");
        Product product = new Product("Ipad", unit);
        assertEquals("Ipad", product.getName());
        assertEquals(unit, product.getUnitWeight());
        assertEquals(2, product.getNumberOfDecimals());
    }

    @Test
    public void totalWeight() {
        BigDecimal unit = new BigDecimal("0.235");
        Product product = new Product("Ipad", unit, 3);
        BigDecimal total = new BigDecimal("0.705");
        assertEquals(total, product.totalWeight(3));
    }
}
