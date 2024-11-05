import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchasedMedia = new ArrayList<>();                                       //غلفت المتغيرات
    private List<Media> shoppingCart = new ArrayList<>();


    User(String username, String email) {         // constract
this.username=username;
this.email=email;
this.purchasedMedia=new ArrayList<>();
this.shoppingCart=new ArrayList<>();
    }

    //set and get
    public void setUsername(){
        this.username=username;}

    public void setEmail(){
        this.email=email;}


    public String getUsername(){

        return username;}

    public String getEmail(){

        return email;}

    public List<Media> getPurchasedMedia() {
        return purchasedMedia;}

    public List<Media> getShoppingCart() {
        return shoppingCart;}

    public void addToCart(Media media) {
        shoppingCart.add(media);}

    public void addPurchasedMedia(Media media) {
        purchasedMedia.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);}

    public void checkout() {
        purchasedMedia.addAll(shoppingCart);

        }


}