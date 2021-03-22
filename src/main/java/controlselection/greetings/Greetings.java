package controlselection.greetings;

public class Greetings {

    public String greeter(int hour, int minute) {
        int result = hourExchanger(hour, minute);
        if (300 < result && result <= 540) {
           return "Jó reggelt";
        } else if (540 < result && result <= 1110) {
            return "Jó napot";
        } else if (1110 < result && result <= 1200) {
            return "Jó estét";
        } else {
            return "Jó éjt";
        }
    }

    private int hourExchanger (int hour, int minute) {
        return hour * 60 + minute;
    }
}
