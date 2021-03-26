package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson searchedPerson = null;
        int difference = 0;
        for (Salesperson salesperson : salespersons) {
            if (difference < salesperson.getDifferenceFromTarget()) {
                difference = salesperson.getDifferenceFromTarget();
                searchedPerson = salesperson;
            }
        }
        return searchedPerson;
    }
}
