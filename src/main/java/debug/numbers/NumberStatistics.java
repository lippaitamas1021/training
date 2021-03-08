package debug.numbers;

import java.util.List;

public class NumberStatistics {

    List<Integer> numbers;

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        if (numbers.size() < 2) {
            throw new IllegalStateException("Not enough item in the list");
        }
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for(int i = 1; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) - numbers.get(i + 1)  >= 0 ? numbers.get(i) - numbers.get(i + 1) : numbers.get(i + 1) - numbers.get(i);
            if(actDifference < minDifference) {
                minDifference = actDifference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        NumberStatistics ns = new NumberStatistics(List.of(4,8,-1,-2,4,5,3));
        System.out.println(ns.sumPositives());
        System.out.println(ns.minDifferenceBetweenNeighbours());

        NumberStatistics ns2 = new NumberStatistics(List.of(-3,-4));
        System.out.println(ns2.sumPositives());

        NumberStatistics ns3 = new NumberStatistics(List.of(1));
        System.out.println(ns3.minDifferenceBetweenNeighbours());

    }
}
