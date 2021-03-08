package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        System.out.println("1. Felhasználók listázása \n2. Felhasználó felvétele \n3. Kilépés");
        System.out.println("Kérem, válasszon egy menüpontot:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Felhasználók listázása");
        } else if (number == 2) {
            System.out.println("Felhasználó felvétele");
        } else {
            System.out.println("");
        }
    }
}
