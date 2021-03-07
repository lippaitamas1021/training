package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy időpontot:");
        String t1 = scanner.nextLine();
        String[] temp = t1.split(":");
        int hour = Integer.parseInt(temp[0]);
        int minute = Integer.parseInt(temp[1]);
        int second = Integer.parseInt(temp[2]);
        Time time1 = new Time(hour, minute, second);

        System.out.println("Kérem, adjon meg egy másik időpontot:");
        String t2 = scanner.nextLine();
        String[] temp2 = t2.split(":");
        int hour2 = Integer.parseInt(temp2[0]);
        int minute2 = Integer.parseInt(temp2[1]);
        int second2 = Integer.parseInt(temp2[2]);
        Time time2 = new Time(hour2, minute2, second2);

        System.out.println("Az első időpont " + time1 + " = " + time1.getInMInutes(time1) + " perc");
        System.out.println("A második időpont " + time2 + " = " + time2.getInSeconds(time2) + " másodperc");
        System.out.println(time1.earlierThan(time2));
    }
}
