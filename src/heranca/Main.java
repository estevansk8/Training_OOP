package heranca;

public class Main {
    public static void main(String[] args) {

        Triangulo t = new Triangulo(0,0,3,4,5);
        System.out.println(t);

        Figura[] figuras = new Figura[150];
        double soma = 0;
        for (int i = 1; i < figuras.length + 1;) {
            //cria os objetos passando o valor de i
            Circulo c = new Circulo(0,0,i);
            Retangulo r = new Retangulo(0,0,i,i);
            Triangulo tr = new Triangulo(0,0,i,i,i);

            double areaC = c.getArea();
            double areaR = r.getArea();
            double areaT = tr.getArea();

            //soma das areas
            soma += (c.getArea() + r.getArea() + tr.getArea());

            //vetor com todos os objetos
            figuras[--i] = c;
            figuras[++i] = r;
            figuras[++i] = tr;
        }

        System.out.println("Valor da soma das areas: " + soma);
    }
}