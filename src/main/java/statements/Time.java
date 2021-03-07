package statements;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getInMInutes(Time time) {
        return (time.hour * 60) + time.minute;
    }

    public int getInSeconds(Time time) {
        return (time.hour * 60 * 60) + (time.minute * 60) + time.second;
    }

    public boolean earlierThan(Time time) {
        return getInSeconds(time) < getInSeconds(this);
   }

    @Override
    public String toString() {
        return hour + ":" + minute + ":"+ second;
    }
}
