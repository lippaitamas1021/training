package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class CdvCheck {

    public boolean check(String taxNumber) {
        if (taxNumber.length() != 10) {
            throw new IllegalArgumentException("Wrong tax number");
        }
        for (char c : taxNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Wrong format of tax number");
            }
        }
        String firstNineNumbers = taxNumber.substring(0, taxNumber.length()-1);
        String lastNumber = taxNumber.substring(taxNumber.length()-1);
        List<Integer> numbers = new ArrayList<>();
        for (char c : firstNineNumbers.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i) * (i + 1);
        }
        return (sum % 11) == Integer.parseInt(lastNumber);
    }
}
