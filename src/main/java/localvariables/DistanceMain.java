package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(5.65);
        System.out.println(distance.getDistance());
        System.out.println(distance.isPunctual(5.64));
    }
}
