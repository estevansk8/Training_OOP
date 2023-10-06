package map;

import java.util.HashMap;
import java.util.Map;

public class PetShop {
    Map<String, Pessoa> clientes = new HashMap<>();


    public void addPessoa (Pessoa pessoa){
        //se a pessoa nao estiver no map ela é adicionada
        if (!clientes.containsKey(pessoa.getCpf())) {
            clientes.put(pessoa.getCpf(), pessoa);
            System.out.println("Adicionado!");
        } else {
            System.out.println("CPF já existente!");
        }
    }
    public void addCachorro (String cpf, String nome, String raca, boolean vacinado){
        if (clientes.containsKey(cpf)){
            Pessoa pessoa = clientes.get(cpf);
            Cachorro novoCachorro = new Cachorro(nome, raca, vacinado);
            pessoa.getCachorros().add(novoCachorro);
            System.out.println("Adicionado com sucesso!!!");
        }
        else{
            System.out.println("Cpf nao cadastrado!!!");
        }
    }

    public void listPessoas(){
        for (Pessoa pessoa : clientes.values()){
            System.out.println(pessoa);
        }
    }
    public void listCachorros(String cpf){
        if (clientes.containsKey(cpf)){
            Pessoa pessoa = clientes.get(cpf);
            for (Cachorro cachorro : pessoa.getCachorros()){
                System.out.println(cachorro);
            }
        }
        else{
            System.out.println("CPF inexistente nos cadastros!");
        }
    }
    public void removePessoa (String cpf){
        if (clientes.containsKey(cpf)){
            clientes.remove(cpf);
            System.out.println("Removido com sucesso!");
        }
        else{
            System.out.println("CPF inexistente nos cadastros!");
        }
    }
    public void removeCachorro (String cpf, String nome){
        if (clientes.containsKey(cpf)){
            String nomePassadoTratado = nome.toLowerCase();
            Pessoa pessoa = clientes.get(cpf);
            for (Cachorro cachorro : pessoa.getCachorros()){
                String nomeCachorro = cachorro.getNome().toLowerCase();
                if (nomePassadoTratado.equals(nomeCachorro)){
                    pessoa.getCachorros().remove(cachorro);
                    System.out.println("Removido com sucesso!!!");
                    break;
                }
            }
        }
        else{
            System.out.println("CPF inexistente nos cadastros!");
        }
    }
    public void listVacinados(boolean vacinados){
        for (Pessoa pessoa : clientes.values()){
            for (Cachorro cachorro : pessoa.getCachorros()){
                if (cachorro.vacinado == vacinados){
                    System.out.println(cachorro);
                }
            }
        }
    }
    public void listVacinados(String cpf, boolean vacinados){
        if (clientes.containsKey(cpf)){
            Pessoa pessoa = clientes.get(cpf);
            for (Cachorro cachorro : pessoa.getCachorros()){
                if (cachorro.vacinado ==  vacinados){
                    System.out.println(cachorro);
                }
            }
        }
    }
}
