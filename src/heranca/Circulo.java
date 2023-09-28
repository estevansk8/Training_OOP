package heranca;

public class Circulo extends Figura{
    private double raio;

    public Circulo(int x, int y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    //sobreescrevendo metodo area
    @Override
    public double getArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
