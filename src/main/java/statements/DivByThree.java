package statements;

import java.util.Scanner;

public class DivByThree {

    public void divBy3(int number) {
        System.out.println(number % 3 == 0 ? "A szám osztható 3-mal maradék nélkül." : "A szám nem osztható 3-mal maradék nélkül.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem, adjon meg egy egész számot:");
        int numberToDivide = scanner.nextInt();
        DivByThree divByThree = new DivByThree();
        divByThree.divBy3(numberToDivide);
    }
}
