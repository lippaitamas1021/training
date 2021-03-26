package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        Salesperson searcedPerson = null;
        int difference = Integer.MAX_VALUE;
        for (Salesperson salesperson : salespersons) {
            if (salesperson.getDifferenceFromTarget() < difference) {
                difference = salesperson.getDifferenceFromTarget();
                searcedPerson = salesperson;
            }
        }
        return searcedPerson;
    }
}
