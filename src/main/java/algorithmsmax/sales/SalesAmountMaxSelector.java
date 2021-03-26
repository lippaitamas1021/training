package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson searchedPerson = null;
        int max = 0;
        for (Salesperson salesperson : salespersons) {
            if (max < salesperson.getAmount()) {
                max = salesperson.getAmount();
                searchedPerson = salesperson;
            }
        }
        return searchedPerson;
    }
}
