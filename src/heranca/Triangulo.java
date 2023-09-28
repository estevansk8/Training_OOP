package heranca;

public class Triangulo extends Figura{
    private double l1,l2,l3;

    public Triangulo(int x, int y, double l1, double l2, double l3) {
        super(x, y);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double getArea() {
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }

    @Override
    public String toString() {
        return "Triangulo = " +
                "| l1 = " + l1 +
                "| l2 = " + l2 +
                "| l3 = " + l3 +
                '|';
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }
}
