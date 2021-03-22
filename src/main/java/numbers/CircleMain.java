package numbers;

public class CircleMain {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(6);

        System.out.println(circle1.perimeter());
        System.out.println(circle1.area());
        System.out.println(circle2.perimeter());
        System.out.println(circle2.area());
    }
}
