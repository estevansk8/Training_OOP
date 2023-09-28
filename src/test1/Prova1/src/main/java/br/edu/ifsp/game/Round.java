package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;

public class Round {
    private String winner;
    private Hand hand;

    public Round(String player1, Card card1, String player2, Card card2, Card vira) {
        int result = card1.compareValueTo(card2, vira);
        if (result == 1) this.winner = player1;
        if (result == -1) this.winner = player2;
        if (result == 0) this.winner = null;
    }
    public String getWinner() {
        return winner;
    }
}
