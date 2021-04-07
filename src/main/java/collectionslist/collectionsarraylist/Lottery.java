package collectionslist.collectionsarraylist;

import java.util.*;

public class Lottery {

    public List<Integer> createNumbers(int ballCount) {
        List<Integer> numbers = new ArrayList<>(ballCount);
        for (int i = 1; i < ballCount + 1; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more, than the winning numbers!");
        }
        List<Integer> choosen = createNumbers(ballCount);
        List<Integer> result = choosen.subList(0, lotteryType);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.selectWinningNumbers(7,35));
    }
}
