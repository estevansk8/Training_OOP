package heranca;

public class Main {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[150];
        double soma = 0;
        int contador_index = 0;

        for (int i = 1; contador_index < figuras.length; i++) {
            //cria os objetos passando o valor de i
            Circulo c = new Circulo(0,0,i);
            Retangulo r = new Retangulo(0,0,i,i);
            Triangulo tr = new Triangulo(0,0,i,i,i);

            //soma das areas
            soma += (c.getArea() + r.getArea() + tr.getArea());

            //vetor com todos os objetos
            figuras[contador_index++] = c;
            figuras[contador_index++] = r;
            figuras[contador_index++] = tr;
        }
        String soma_formato = String.format("%.2f", soma);
        System.out.println("Valor da soma das areas: " + soma_formato);
    }
}