package abstractclass.gamecharacter;

public class Point {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point anotherPoint) {
        if (anotherPoint == null) {
            throw new IllegalArgumentException("A pozíció kitöltése kötelező");  }
        return (long) Math.sqrt(Math.pow(this.x - anotherPoint.x, 2) + Math.pow(this.y - anotherPoint.y, 2));
    }
}
