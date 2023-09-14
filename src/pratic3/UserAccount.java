package pratic3;

public class UserAccount {
    public static final int MAX_SIZE = 100;
    public static final int MAX_TIMELINE_POSTS = 10;
    private String email;
    private String userName;
    private UserAccount[] followers = new UserAccount[MAX_SIZE];
    private Post[] posts = new Post[MAX_SIZE];
    private Post[] timeline = new Post[MAX_TIMELINE_POSTS];


    private int cont_followers;
    private int cont_posts;
    private int cont_timeline_posts;



    public UserAccount(String userName) {
        this.userName = userName;
    }


    //EXERCICIO 5
    public void publish(String quote){
        //pega um post e insere nos posts proprios
        Post post = new Post(quote,this);
        posts[cont_posts++] = post;

        //precisa-se inserir nos posts dos seguidores
        for (UserAccount follower : followers){
            if (follower != null){
                follower.updateTimeline(post);
            }
        }
    }
    //EXERCICIO 6
    public void updateTimeline(Post newPost){
        //adicionar os posts na ultima posição da timeline ou substitui se cheia
        int index_posicao_post_timeline = cont_timeline_posts % MAX_TIMELINE_POSTS;
        timeline[index_posicao_post_timeline] = newPost;
        cont_timeline_posts++;
    }
    //EXERCICIO 7
    public boolean delete(int postIdx){
        boolean deleted = false;
        if (postIdx == 0 && cont_posts == 1){
            posts[--cont_posts] = null;
            deleted = true;
            return deleted;
        }
        if (postIdx < 0 || postIdx >= cont_posts){
            return deleted;
        }
        for (int i = postIdx; i < cont_posts;i++){
            posts[i] = posts[i+1];
        }
        posts[cont_posts--] = null;
        return deleted;
    }
    //EXERCICIO 8
    public void clapPost(int postIdx){
        if (postIdx < 0 || postIdx >= cont_timeline_posts){
            timeline[postIdx].clap();
        }
    }
    public void booPost(int postIdx){
        if (postIdx < 0 || postIdx >= cont_timeline_posts){
            timeline[postIdx].boo();
        }
    }
    //EXERCICIO 9
    public void acceptFollower(UserAccount userAccount){
        followers[cont_followers++] = userAccount;
    }
    public void blockFollower(UserAccount follower){
        for(int i = 0; i < cont_followers; i++){
            if (followers[i] == follower){
                for (int j = i; j < cont_followers; j++){
                    followers[i] = followers[i+1];
                }
                followers[cont_followers--] = null;
            }
        }
    }
    //NAO ESTAVA NOS EXERCICIOS PARA FAZER MAS DEVERIA SER IMPLEMENTADO
    public String showTimeLine(){

        String string = "";
        for (int i = 0; i < cont_timeline_posts -1 ; i ++){
            string += timeline[i].show() + "\n";
        }
        return string;
    }
    public String showMyPosts(){
        String string = "";
        for (int i = 0; i < cont_posts; i ++){
            string += posts[i].show() + "\n";
        }
        return string;
    }
    public String showMyFriends(){
        String string = "";
        for (int i = 0; i < cont_followers; i ++){
            string += followers[i].getUserName() + "\n";
        }
        return string;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
