package Practice.Prototype;

public class Prototype {
    private int x;
    private int y;

    public Prototype(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Prototype clone() {
        return new Prototype(x, y);
    }

}
