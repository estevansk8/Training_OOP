package pratic2;

import java.util.ArrayList;

public class Bank {

    public static final int MAX_LENGHT = 15;
    private int number;
    private Account[] bankAccounts;


    public Bank(int number) {
        this.number = number;
        bankAccounts = new Account[MAX_LENGHT];
    }

    public void addAccount(Account account){
        boolean added = false;
        if (account.getBank().getNumber() == this.number){
            for (int i = 0; i < MAX_LENGHT; i++){
                if (bankAccounts[i] == null) {
                    bankAccounts[i] = account;
                    added = true;
                    break;
                }
            }
        }
        if (!added) System.out.println("Não foi possivel adicionar!!!");
    }
    public void listAccounts(long agency){
        System.out.println("--- LISTA DE CONTAS DO BANCO---");
        for (Account account : bankAccounts){
            if (account != null){
                if (agency == -1 || account.getAgency() == agency){
                    System.out.println(account.getNumber() + " " + account.getClient().getName());
                }
            }
        }
        System.out.println("---------------------------");
    }
    public void listAccounts(){
        listAccounts(-1);
    }
    public double approveLimit(double amount, int accountTime){
        return Math.min(amount, 200 + 300 * accountTime);
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
