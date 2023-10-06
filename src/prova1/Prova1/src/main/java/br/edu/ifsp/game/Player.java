package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;

public class Player {
    private String name;
    private int score;
    private Card[] cards;

    private int count_card;

    public Player(String name) {
        this.name = name;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    public Card chooseCard(){
        return cards[count_card++];
    }
    public void incrementScore(){
        score++;
    }
    public int getScore() {
        return score;
    }
}
