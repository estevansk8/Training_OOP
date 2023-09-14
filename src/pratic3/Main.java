package pratic3;

public class Main {
    public static void main(String[] args) {
        //CASOS DE TESTE COPIADOS DO EXERCICIO DO PROFESSOR

        //CRIA USUARIOS
        UserAccount fernando = new UserAccount("fer2023");
        UserAccount manhani = new UserAccount("asManha");
        UserAccount derisso = new UserAccount("derrrr");
        UserAccount ana = new UserAccount("aninha");
        UserAccount gatti = new UserAccount("miau");

        //USUARIOS ACEITANDO SEGUIDORES
        fernando.acceptFollower(manhani);
        fernando.acceptFollower(derisso);
        fernando.acceptFollower(ana);

        //MOSTRANDO OS SEGUIDORES
        System.out.println("==== Followers do Fernando");
        System.out.println(fernando.showMyFriends());

        //
        System.out.println("==== Fernando fez um post");
        fernando.publish("Festa sexta-feira");
        System.out.println("Timeline do Manhani: \n" + manhani.showTimeLine());
        System.out.println("Timeline do Derisso: \n" + derisso.showTimeLine());
        System.out.println("Posts do Fernando:  \n" + fernando.showMyPosts());

//        System.out.println("==== Fernando viralizou ====");
//        manhani.booPost(0);
//        manhani.booPost(0);
//        derisso.clapPost(0);
//        System.out.println("Posts do Fernando:  \n" + fernando.showMyPosts());

        System.out.println("=== Fernando tá puto com o Manhani");
        fernando.blockFollower(manhani);
        System.out.println(fernando.showMyFriends());

        // Segunda publicação do fernando
        // System.out.println("=== Fernando lacra sobre Manhani");
        System.out.println("=== Segunda publicação do Fernando");
        fernando.publish("Vai vaiar a vó!");


        System.out.println("Timeline do Derisso: \n" + derisso.showTimeLine());
        System.out.println("Timeline do Manhani: \n" + manhani.showTimeLine());

        System.out.println("=== Manhani está putasso!");
        manhani.acceptFollower(gatti);
        for (int i = 0; i < 11; i++) {
            manhani.publish("Eu detesto o Fernando " + (i+1) + " vezes!");
        }
        System.out.println("Timeline do Gatti: \n" + gatti.showTimeLine());

        System.out.println("Manhani está arrependido! =( ");

        // OUTRO BO
        gatti.booPost(10);
        for (int i = 10; i >= 0; i--) {
            manhani.delete(i);
        }
        System.out.println("Posts do Manhani: \n" + manhani.showMyPosts());
    }
}
