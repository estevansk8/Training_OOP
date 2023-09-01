package pratic2;

import java.util.ArrayList;

public class Bank {
    private int number;

    private ArrayList<Account> bankAccounts;

    public Bank(int number) {
        this.number = number;
        bankAccounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        if (account.getBank().getNumber() == this.number) bankAccounts.add(account);
    }

    public void listAccounts(){
        System.out.println("--- LISTA DE CONTAS DO BANCO ---");
        for (Account account : bankAccounts){
            System.out.println(account.getBank().getNumber() + " " + account.getClient().getName());
        }
        System.out.println("---------------------------");
    }
    public void listAccounts(long agency){
        System.out.println("--- LISTA DE CONTAS Da AGENCIA ---");
        for (Account account : bankAccounts){
            if (account.getAgency() == agency){
                System.out.println(account.getNumber());
            }
        }
    }
    public double approveLimit(double amount, int accountTime){
        double approveLimit = 200 + (300 * accountTime);

        if (amount > approveLimit) return approveLimit;
        return amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
