package controlselection.month;

public class DayInMonth {

    int lengthOfMonth;

    public int numOfDays(int year, String month) {
        paramCheck(year, Month.valueOf(month.toUpperCase()).getIndex());
        if (!leapYear(year)) {
            switch (Month.valueOf(month.toUpperCase()).getIndex()) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    lengthOfMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    lengthOfMonth = 30;
                    break;
                case 2:
                    lengthOfMonth = 28;
                    break;
            }
        } else {
            switch (Month.valueOf(month.toUpperCase()).getIndex()) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    lengthOfMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    lengthOfMonth = 30;
                    break;
                case 2:
                    lengthOfMonth = 29;
                    break;
            }
        }
        return lengthOfMonth;
    }

    public boolean leapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public void paramCheck(int year, int month) {
        if (year < 0) {
            throw new IllegalArgumentException("Wrong year");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month" + month);
        }
    }
}
