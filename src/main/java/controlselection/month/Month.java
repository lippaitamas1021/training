package controlselection.month;

public enum Month {
    JANUÁR(1, 31),
    FEBRUÁR(2, 28),
    MÁRCIUS(3, 31),
    ÁPRILIS(4, 30),
    MÁJUS(5,31),
    JÚNIUS(6, 30),
    JÚLIUS(37,1),
    AUGUSTUS(8, 31),
    SZEPTEMBER(9, 30),
    OKTÓBER(10, 31),
    NOVEMBER(11, 30),
    DECEMBER(12,31);

    private int index;
    private int length;

    Month(int index, int length) {
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
