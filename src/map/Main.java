package map;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {

        PetShop petBrabo = new PetShop();

        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("MENU:");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Adicionar Cachorro");
            System.out.println("3. Listar Pessoas");
            System.out.println("4. Listar Cachorros de uma Pessoa");
            System.out.println("5. Remover Pessoa");
            System.out.println("6. Remover Cachorro");
            System.out.println("7. Listar Cachorros Vacinados");
            System.out.println("8. Listar Cachorros Vacinados de uma Pessoa");
            System.out.println("0. Sair");

            System.out.println("Escolha uma opcao: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.print("Nome: ");
                    String nomePessoa = sc.next();
                    System.out.print("CPF: ");
                    String cpfPessoa = sc.next();
                    petBrabo.addPessoa(new Pessoa(nomePessoa, cpfPessoa));
                    break;
                case 2:
                    System.out.print("CPF da Pessoa: ");
                    String cpfDono = sc.next();
                    System.out.print("Nome do Cachorro: ");
                    String nomeCachorro = sc.next();
                    System.out.print("Raça do Cachorro: ");
                    String racaCachorro = sc.next();
                    System.out.print("Cachorro Vacinado (true/false): ");
                    boolean vacinado = sc.nextBoolean();
                    petBrabo.addCachorro(cpfDono, nomeCachorro, racaCachorro, vacinado);
                    break;
                case 3:
                    petBrabo.listPessoas();
                    break;
                case 4:
                    System.out.print("CPF da pessoa: ");
                    String cpfPessoaList = sc.next();
                    petBrabo.listCachorros(cpfPessoaList);
                    break;
                case 5:
                    System.out.print("CPF da pessoa a ser removida: ");
                    String cpfPessoaRemove = sc.next();
                    petBrabo.removePessoa(cpfPessoaRemove);
                    break;
                case 6:
                    System.out.print("CPF do dono do cachorro a ser removido: ");
                    String cpfDonoRemove = sc.next();
                    System.out.print("Nome do Cachorro a ser removido: ");
                    String nomeCachorroRemove = sc.next();
                    petBrabo.removeCachorro(cpfDonoRemove, nomeCachorroRemove);
                    break;
                case 7:
                    System.out.print("Listar cachorros vacinados ou não(insira true ou false): ");
                    boolean vacinadoList = sc.nextBoolean();
                    petBrabo.listVacinados(vacinadoList);
                    break;
                case 8:
                    System.out.print("CPF da pessoa: ");
                    String cpfPessoaVacinado = sc.next();
                    System.out.print("Listar cachorros vacinados: ");
                    boolean vacinadoPessoa = sc.nextBoolean();
                    petBrabo.listVacinados(cpfPessoaVacinado, vacinadoPessoa);
                    break;
                case 0:
                    System.out.println("Saindo ...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);



//        Pessoa danilo = new Pessoa("Danilo", "1");
//
//        Cachorro zeus = new Cachorro("Zeus","Pit Bull", true);
//        danilo.getCachorros().add(zeus);
//        Cachorro zeckt = new Cachorro("Zeckt","Poodle", true);
//        danilo.getCachorros().add(zeckt);
//        Cachorro mel = new Cachorro("Mel","Labrador", false);
//        danilo.getCachorros().add(mel);
//        Cachorro spider = new Cachorro("Spider", "Pastor alemão", false);
//        danilo.getCachorros().add(spider);
//        petBrabo.addPessoa(danilo);
//
//
//        Pessoa miguel = new Pessoa("Miguel", "2");
//
//        Cachorro meg = new Cachorro("Meg","pub",true);
//        miguel.getCachorros().add(meg);
//        Cachorro jaka = new Cachorro("Jaka","Vira-lata",false);
//        miguel.getCachorros().add(jaka);
//        petBrabo.addPessoa(miguel);
//
//        petBrabo.addCachorro("2","Pangare", "poodle", false);
//        petBrabo.addCachorro("3","Pangare", "poodle", false);
//
//        petBrabo.listPessoas();
//
//        System.out.println("----------------------------");
//        petBrabo.listCachorros("1");
//        System.out.println("----------------------------");
//        petBrabo.listCachorros("2");
//
//        petBrabo.removeCachorro("1","Zeus");
//
//        petBrabo.listVacinados(true);
//        System.out.println("----------------------------");
//        petBrabo.listVacinados(false);
//        System.out.println("----------------------------");
//
//        petBrabo.listVacinados("1", false);
//        petBrabo.removePessoa("2");

    }
}