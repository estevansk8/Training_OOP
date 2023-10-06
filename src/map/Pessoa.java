package map;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private ArrayList<Cachorro> cachorros;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.cachorros = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<Cachorro> getCachorros() {
        return cachorros;
    }

    @Override
    public String toString() {
        return "Cpf:" + cpf +
                " Nome: " + nome ;
    }

}
