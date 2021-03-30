package introinheritance.basket;

public class ShoppingBasket {

    private Basket basket = new Basket();

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double counter = 0.0;
        for (Item item : basket.getItems()) {
            counter += item.getNettoPrice();
        }
        return counter;
    }

    public double sumTaxValue() {
        double counter = 0.0;
        for (Item item : basket.getItems()) {
            counter += item.getTaxAmount();
        }
        return counter;
    }

    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout() {
        basket.clearBasket();
    }

    public void removeMostExpensiveItem() {
        double mostExpensivePrice = 0.0;
        for (Item item : basket.getItems()) {
            if (mostExpensivePrice < item.getNettoPrice()) {
                mostExpensivePrice = item.getNettoPrice();
            }
        }
        for (Item item : basket.getItems()) {
            if (item.getNettoPrice() == mostExpensivePrice) {
                basket.removeItem(item.getBarcode());
            }
        }
    }
}
