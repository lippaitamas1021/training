package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {
    private List<Integer> counters = new ArrayList<>();

    public List<Integer> find(List<Integer> listOfNumbers) {
        if (listOfNumbers.isEmpty() || listOfNumbers.size() == 1) {
            return new ArrayList<>();
        }
        for (int i = 1; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i).equals(listOfNumbers.get(i-1))) {
                if (!counters.contains(listOfNumbers.get(i))) {
                    counters.add(listOfNumbers.get(i));
                }
            }
        }
        return counters;
    }

    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();
        duplicates.find(Arrays.asList(1, 2, 2, 3, 3));
    }
}
