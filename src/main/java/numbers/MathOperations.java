package numbers;

import java.util.Scanner;

public class MathOperations {

    private int result = 3;

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Mennyi az eredménye az alábbi műveletnek?");
        System.out.println("5+4-2*(6/2)=?");
        Scanner scanner = new Scanner(System.in);
        int userResult = scanner.nextInt();
        scanner.nextLine();
        MathOperations mo = new MathOperations();
        if (userResult == mo.getResult()) {
            System.out.println("Helyes az eredmény!");
        } else {
            System.out.println("Helytelen eredmény!");
        }
    }
}
