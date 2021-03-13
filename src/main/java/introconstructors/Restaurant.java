package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<String> menu;
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * 4;
        this.menu = addMenu();
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    private List<String> addMenu() {
        List<String> meals = new ArrayList<>();
        meals.add("Brassói aprópecsenye");
        meals.add("Jókai bableves");
        return meals;
    }

}
