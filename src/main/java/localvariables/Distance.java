package localvariables;

public class Distance {

    private double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public boolean isPunctual(double d) {
        return distance == d;
    }
}
