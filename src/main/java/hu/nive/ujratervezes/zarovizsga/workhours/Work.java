package hu.nive.ujratervezes.zarovizsga.workhours;

public class Work {

    private String name;
    private int numberOfHours;
    private String date;

    public Work(String name, int numberOfHours, String date) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", numberOfHours=" + numberOfHours +
                ", date='" + date + '\'' +
                '}';
    }
}
