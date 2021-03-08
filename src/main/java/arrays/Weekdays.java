package arrays;

public enum Weekdays {
    HÉTFŐ(1), KEDD(2), SZERDA(3), CSÜTÖRTÖK(4), PÉNTEK(5), SZOMBAT(6), VASÁRNAP(7);

    private int index;

    Weekdays(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
