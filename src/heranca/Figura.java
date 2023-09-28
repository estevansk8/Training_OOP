package heranca;

public abstract class Figura {
    private int x,y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
