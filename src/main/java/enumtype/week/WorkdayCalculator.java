package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> result = new ArrayList<>();
        for (int i = firstDay.getIndex(); i < Day.values().length; i++) {
            result.add(Day.values()[i].getType());
        }
        return result;
    }

    private Day nextDay(Day day) {
        Day daySearched = null;
        for (int i = 0; i < Day.values().length; i++) {
            if (Day.values()[i] == day) {
                daySearched = Day.values()[i+1];
            }
        }
        return daySearched;
    }
}
