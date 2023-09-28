package heranca;

public class Retangulo extends Figura{
    private double largura,comprimento;

    public Retangulo(int x, int y, double largura, double comprimento) {
        super(x, y);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double getArea() {
        return largura * comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }
}
