package br.edu.ifsp.game;

public class Game {
    public static final int MAX_HANDS = 30;
    private Player player1;
    private Player player2;
    private Hand[] hands = new Hand[MAX_HANDS];
    private int countHands;


    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(){
//        if (hands[countHands].isDone()){
//
//        }
        hands[countHands].playRound();

    }
    public boolean isDone(){
        if (player1.getScore() == 12 || player2.getScore() == 12) return true;
        return false;
    }
    public Player getWinner(){
        if (!isDone()) return null;
        if (player1.getScore() == 12) return player1;
        return player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
