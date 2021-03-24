package introexception.patient;

import java.util.ArrayList;
import java.util.List;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        try {
            List<Integer> ssnNumbers = new ArrayList<>();
            for (char c : ssn.toCharArray()) {
                if (Character.isDigit(c)) {
                    ssnNumbers.add(Integer.parseInt(String.valueOf(c)));
                } else {
                    return false;
                }
            }
            int counter = 0;
            for (int i = 0; i < ssnNumbers.size() - 1; i++) {
                if (i == 0) {
                    counter += ssnNumbers.get(0) * 7;
                }
                if (i % 2 != 0) {
                    counter += ssnNumbers.get(i) * 3;
                } else {
                    counter += ssnNumbers.get(i) * 7;
                }
            }
            String lastNumber = ssn.substring(ssn.length() - 1);
            return counter % 10 == Integer.parseInt(lastNumber);
        } catch (NullPointerException ne) {
            throw new IllegalArgumentException("SSN must contains only numbers", ne);
        }
    }
}
