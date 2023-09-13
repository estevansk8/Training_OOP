package pratic2;

public class Main {
    public static void main(String[] args){
        //Criando cliente
        Client estevan = new Client("Estevan");
        Client ricardo = new Client("Ricardo");

        //Criando banco
        Bank nubank = new Bank(1);
        Bank caixa = new Bank(2);
        Bank itau = new Bank(3);

        //Ligando usuario a uma conta
        Account estevanNubank = new Account(123, estevan, nubank);
        estevan.addAccount(estevanNubank);
        nubank.addAccount(estevanNubank);

        Account estevancaixa = new Account(123, estevan, caixa);
        estevan.addAccount(estevancaixa);
        caixa.addAccount(estevancaixa);

        Account estevanitau = new Account(123, estevan, itau);
        estevan.addAccount(estevanitau);
        itau.addAccount(estevanitau);

        Account ricardocaixa = new Account(123, ricardo, caixa);
        ricardo.addAccount(ricardocaixa);
        caixa.addAccount(ricardocaixa);
        //adicionando conta em banco errado
        nubank.addAccount(ricardocaixa);


        //Listando os usuarios
        estevan.listAccounts();
        ricardo.listAccounts();

        //Listando contas no banco

        caixa.listAccounts();
        nubank.listAccounts();
        itau.listAccounts();

        //Pedindo para aumentar limite da conta
        estevanNubank.increaseLimit(100,123);
        estevancaixa.increaseLimit(300,123);
        ricardocaixa.increaseLimit(200,123);

        //Fazendo alterações na conta
        estevanNubank.withDraw(50,123);
        estevanNubank.balance(123);
        estevanNubank.deposit(51,123);
        estevanNubank.balance(123);


    }
}
