package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void removeItem(String barcode) {
        items.removeIf(item -> item.getBarcode().equals(barcode));
    }

    public void clearBasket() {
        items.clear();
    }
}
