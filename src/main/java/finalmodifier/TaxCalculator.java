package finalmodifier;

public class TaxCalculator {

    private static final double VAT = 0.27;
    private static final double VAT2 = 0.2126;

    public double tax(double price) {
        return price * VAT2;
    }

    public double priceWithTax(double price) {
        return price + (price * VAT);
    }

    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();
        System.out.println(tc.tax(1000));
        System.out.println(tc.priceWithTax(1000));
    }
}
