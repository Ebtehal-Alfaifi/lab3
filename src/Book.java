import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
private int quantitystock;
private ArrayList<Review>reviews=new ArrayList<>();

    Book(String title, String auteur, String isbn, double prise,int quantitystock) {
        super(title, auteur, isbn, prise);
        this.quantitystock=quantitystock;
        this.reviews=new ArrayList<>();
    }

    public void setStock(){
        this.quantitystock=quantitystock;
    }
    public int getStock(){

        return quantitystock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public double getAvrageRating(){
        double total=0;// قيمه ابتدائيية
      for (Review review:reviews){
          double parseDouble;
          total+= review.getRating();
      }
      if (reviews.size()!=0){
        return total/reviews.size();}
      else System.out.println(" you should enter rating");
        return 0.0;
    }
    public void purchase(User user) {
        if (quantitystock > 0) {
            quantitystock--;
            user.addToCart(this);
        } else {
            System.out.println("Out of stock");
        }}
    public boolean isBestSeller() {
        return getAvrageRating() >= 4.5;
    }

    public void restock(int quantity) {
        quantitystock += quantity;
        System.out.println("Restocked " + quantity + " units. Total in stock: " + quantitystock);
    }


    public String getMediaType() {
            if (isBestSeller()) {
                return "Bestselling Book";
            } else {
                return "Book";
            }}

    //override  استخدمت نفس الميثود بس عدلت في الخصائص
    public String toString() {
        return super.toString() + ", Quantity in stock: " + quantitystock;
    }





    }













