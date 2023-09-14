package pratic3;

public class UserAccount {
    public static final int MAX_SIZE = 100;
    public static final int MAX_TIMELINE_POSTS = 10;
    private String email;
    private String userName;
    private UserAccount userAccount;

    private UserAccount[] followers;
    private Post[] posts;
    private Post[] timeline;


    private int cont_followers;
    private int cont_posts;
    private int cont_timeline_posts;



    public UserAccount(String userName) {
        this.userName = userName;
        followers = new UserAccount[MAX_SIZE];
        posts = new Post[MAX_SIZE];
        timeline = new Post[MAX_TIMELINE_POSTS];

        cont_followers = 0;
        cont_posts = 0;
        cont_timeline_posts = 0;
    }



    public void publish(String quote){
        posts[this.cont_posts] = new Post(quote,this.userAccount);
        updateTimeline(posts[this.cont_posts]);
        this.cont_posts++;
    }
    public void updateTimeline(Post newPost){
        for (UserAccount follower : followers){
            follower.add_post_timeline(newPost);
        }
    }
    public void add_post_timeline(Post post){
        int index_post_timeline = cont_timeline_posts % MAX_TIMELINE_POSTS;
        timeline[index_post_timeline] = post;
    }
    public boolean delete(int postIdx){

    }
    public String showTimeLine(){

    }
    public String showMyPosts(){

    }
    public String showMyFriends(){

    }
    public void clapPost(int postIdx){

    }
    public void booPost(int postIdx){

    }

    public void acceptFollower(UserAccount userAccount){

    }
    public void blockFollower(UserAccount follower){

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

    public Post[] getTimeline() {
        return timeline;
    }
}
