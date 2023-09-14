package pratic3;

import java.time.LocalDateTime;

public class Post {
    private String quote;
    private LocalDateTime dateTime;
    private int claps;
    private int boos;
    private UserAccount user;

    public Post(String quote, UserAccount account) {
        this.quote = quote;
        this.user = account;
        this.dateTime = LocalDateTime.now();
    }
    //EXERCICIO 4
    public String show(){
        String string = "[" + this.dateTime + "] " + user.getUserName() + " says: " + this.quote + " |" +
                "Claps: " + this.claps + " | Boos : " + this.boos;

        return string;
    }
    public void clap(){
        claps++;
    }
    public void boo(){
        boos++;
    }

    public int getClaps() {
        return claps;
    }

    public int getBoos() {
        return boos;
    }

}
