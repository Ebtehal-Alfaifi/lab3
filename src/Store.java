import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> mediaList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();


Store(){

    this.mediaList=new ArrayList<>();
    this.userList=new ArrayList<>();
}



    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> displayUsers() {
        return userList;
    }
    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public List<Media> displayMedias() {
        return mediaList;
    }
    public Book searchBook(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) ;
            return (Book) media;
        }
        return null;
    }










    }










