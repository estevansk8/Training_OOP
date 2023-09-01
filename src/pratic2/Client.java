package pratic2;

import java.util.ArrayList;

public class Client {
    private String name;
    private String cpf;

    private ArrayList<Account> clientAccounts;

    public Client(String name) {
        this.name = name;
        clientAccounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        clientAccounts.add(account);

    }
    public void listAccounts(){
        System.out.println("---- LISTA DE CONTAS  DO USUÁRIO ----");
        for (Account account : clientAccounts){
            System.out.println(account.getBank().getNumber() + " " + account.getClient().getName());
        }
        System.out.println("-------");
    }

    public String getName() {
        return name;
    }
}
