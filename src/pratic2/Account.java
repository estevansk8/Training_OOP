package pratic2;

public class Account {
    private long number;
    private long agency;
    private double balance;
    private double availableCredit;
    private int password;
    private int accountTime;

    private Client client;
    private Bank bank;


    public Account(int password, Client client, Bank bank) {
        this.password = password;
        this.client = client;
        this.bank = bank;
    }

    public boolean withDraw(double amount, int password){
        if (password == this.password){
            if (amount <= balance + availableCredit){
                balance -= amount;
                return true;
            }
        }
        return false;
    }
    public boolean deposit(double amount, int password){
        if (password == this.password){
            if (amount > 0){
                balance += amount;
                return true;
            }
        }
        return false;
    }
    public void increaseLimit(double amount, int password){
        if (password == this.password){
            this.availableCredit = bank.approveLimit(amount, this.accountTime);
            System.out.println("Aumentado com sucesso !!!");
        }
        else System.out.println("SENHA ERRADA !!!");
    }
    public void balance(int password){
        if (password != this.password) System.out.println("SENHA INCORRETA");
        else System.out.println(balance);
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getAgency() {
        return agency;
    }

    public Client getClient() {
        return client;
    }

    public Bank getBank() {
        return bank;
    }

}
