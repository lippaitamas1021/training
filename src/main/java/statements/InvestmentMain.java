package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Kérem adja meg a befektetett összeget:");
     int fund = scanner.nextInt();
     scanner.nextLine();

     System.out.println("Kérem, adja meg a kamatláb mértkét:");
     int interestRate = scanner.nextInt();
     scanner.nextLine();

     Investment investment = new Investment(fund, interestRate);
        System.out.println(investment.getYield(50));
        System.out.println(investment.close(80));
        System.out.println(investment.close(90));
    }
}
