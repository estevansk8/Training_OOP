package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;
import br.edu.ifsp.deck.Deck;

public class Hand {
    public static final int MAX_ROUNDS = 3;
    private Card vira;
    private Game game;
    private Round[] rounds = new Round[MAX_ROUNDS];

    private int countRounds;

    public Hand(Player player1, Player player2){
        this.game = game;
        Deck deck = new Deck();
        deck.shuffle();

        this.vira = deck.takeOne();
        player1.setCards(deck.take(3));
        player2.setCards(deck.take(3));
    }

    public void playRound(){
        
    }
    public boolean isDone(){
        if (rounds[1].getWinner().equals(rounds[2].getWinner()) || rounds[1].getWinner().equals(rounds[3].getWinner())){
            return true;
        }
        return false;
    }
    public String getWinner(){
        if (!isDone()) return null;
        if (rounds[1].getWinner().equals(rounds[2].getWinner()) || rounds[1].getWinner().equals(rounds[3].getWinner())){
            return rounds[1].getWinner();
        }
        return rounds[2].getWinner();
    }
}
