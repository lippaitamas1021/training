package finalmodifier;

public class CircleCalculator {

    private static final double PI = 3.14;

    public double calculatePerimeter(double r) {
        return 2 * r * PI;
    }

    public double calculateArea(double r) {
        return r * r * PI;
    }

    public static void main(String[] args) {
        CircleCalculator cc = new CircleCalculator();
        System.out.println(cc.calculatePerimeter(5));
        System.out.println(cc.calculateArea(5));

    }
}
