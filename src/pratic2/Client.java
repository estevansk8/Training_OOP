package pratic2;

import java.util.ArrayList;

public class Client {
    public static final int MAX_LENGHT = 15;
    private String name;
    private String cpf;

    private Account[] clientAccounts;
    private int contClientAccounts;

    public Client(String name) {
        this.name = name;
        clientAccounts = new Account[MAX_LENGHT];
    }

    public void addAccount(Account account){
        clientAccounts[contClientAccounts++] = account;
    }
    public void listAccounts(){
        System.out.println("---- LISTA DE CONTAS  DO USUÁRIO ----");
        for (Account account : clientAccounts){
            if (account != null){
                System.out.println(account.getBank().getNumber() + " " + account.getClient().getName());
            }
        }
        System.out.println("-------");
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}
