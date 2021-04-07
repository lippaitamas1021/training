package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) {
        if (maxNumber <= drawCount) {
            throw new IllegalArgumentException("drawCount must be less then 8!");
        }
        Set<Integer> numbers = new TreeSet<>();
        for (int i = 1; i < maxNumber + 1; i++) {
            numbers.add(i);
        }
        List<Integer> result = new ArrayList<>(numbers);
        for (int i : numbers) {
            result.add(i);
        }
        Collections.shuffle(result);
        Set<Integer> choosenNumbers = new TreeSet<>();
        for (int i = 1; i < drawCount + 1; i++) {
            choosenNumbers.add(result.get(i));
        }
        return choosenNumbers;
    }

    public static void main(String[] args) {
        Draw draw = new Draw();
        System.out.println(draw.drawNumbers(5,90));
    }
}
