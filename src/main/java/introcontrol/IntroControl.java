package introcontrol;

public class IntroControl {

    public String describeNumber(int number) {
        return number == 0 ? "zero" : "not zero";
    }

    public String greetingToJoe(String name) {
        return "Joe".equals(name) ? "Hello, Joe!" : "";
    }

    public int calculateBonus(int sale) {
        return (1_000_000 <= sale) ? (int) (sale * 0.1) : 0;
    }

    public int calculateConsumption(int prev, int next) {
        return (next < 9999) ? next - prev : ((10000 - prev) + next);
        }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max) {
        for (int i = 1; i <= max; i = i+2) {
            System.out.println(i);
        }
    }

    public int subtractTenIfGreaterThanTen(int number) {
        return number <= 10 ? number : number - 10;
    }
}
