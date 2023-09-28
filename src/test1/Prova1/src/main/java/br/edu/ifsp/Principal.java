package br.edu.ifsp;

import br.edu.ifsp.game.Game;
import br.edu.ifsp.game.Hand;
import br.edu.ifsp.game.Player;
import br.edu.ifsp.game.Round;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Ta rodando pelo menos");

        //CRIANDO PLAYERS
        Player neymar = new Player("Neymar");
        Player cassio = new Player("Cassio");

        //CRIANDO JOGO
        Game jogoLendas = new Game(neymar,cassio);

    }

}
