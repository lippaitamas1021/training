package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int hour1, int hour2, int minute) {
        timeTable.add(new SimpleTime(hour1, minute));
        timeTable.add(new SimpleTime(hour2, minute));
        timeTable.add(new SimpleTime(hour2, minute));
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public String nextBus(SimpleTime time) {
        for (int i = 0; i < timeTable.size(); i++) {
            if (time.getHours() < timeTable.get(i).getHours()) {
                return timeTable.get(i).toString();
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
}
