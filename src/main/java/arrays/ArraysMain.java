package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = new int[12];
        for (int i = 0; i < Months.values().length; i++) {
            numberOfDays[i] = Integer.parseInt(String.valueOf(Months.values()[i].getLength()));
        }
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < Weekdays.values().length; i++) {
            result.add(String.valueOf(Weekdays.values()[i]));
        }
        return result;
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] a, int[] b) {
        int[] copyOfA = Arrays.copyOf(a,a.length);
        int[] copyOfB = Arrays.copyOf(b,b.length);
        Arrays.sort(copyOfA);
        Arrays.sort(copyOfB);
        return Arrays.equals(copyOfA, copyOfB);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.daysOfWeek());
        System.out.println(arraysMain.multiplicationTableAsString(3));
        int[] winner = new int[]{1, 2, 3, 4, 5};
        int[] stake = new int[]{5, 4, 3, 2, 1};
        System.out.println(arraysMain.wonLottery(winner, stake));
    }
}
