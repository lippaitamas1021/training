package arrays;

public enum Months {

    JANUARY(1,31),
    FEBRUARY(2,28),
    MARCH(3,31),
    APRIL(4,30),
    MAY(5,31),
    JUNE(6,30),
    JULY(7,31),
    AUGUST(8,31),
    SEPTEMBER(9,30),
    OCTOBER(10,31),
    NOVEMBER(11,30),
    DECEMBER(12,31);

    private int index;
    private int length;

    Months(int index, int length) {
        this.index = index;
        this.length = length;
    }

    public int getIndex() {
        return index;
    }

    public int getLength() {
        return length;
    }
}
