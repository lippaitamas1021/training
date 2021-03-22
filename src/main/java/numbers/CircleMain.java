package numbers;

import java.util.Scanner;
    
public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adja meg az első kör átmérőjét:");
        int diameter1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem, adja meg a második kör átmérőjét:");
        int diameter2 = scanner.nextInt();
        scanner.nextLine();

        Circle circle1 = new Circle(diameter1);
        Circle circle2 = new Circle(diameter2);

        System.out.println(circle1.perimeter());
        System.out.println(circle1.area());
        System.out.println(circle2.perimeter());
        System.out.println(circle2.area());
    }
}
