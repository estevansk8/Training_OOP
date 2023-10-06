package map;

public class Cachorro   {
    String nome;
    String raca;
    boolean vacinado;

    public Cachorro(String nome, String raca, boolean vacinado) {
        this.nome = nome;
        this.raca = raca;
        this.vacinado = vacinado;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome  +
                "| Raca: " + raca +
                "| Vacinado: " + vacinado ;
    }
}
