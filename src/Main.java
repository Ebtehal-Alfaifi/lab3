import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
    User u=new User("sara","sara_20@gmail.com");
    User u1=new User("lara","lara_20@gmail.com");
    store.addUser(u);
    store.addUser(u1);


    //_________________________________________________________________
Book b1=new Book("Macbeth","wiliam shakesper","9090",50.0,5);
Book b2=new Book("war and pace","leo Tolstoy","90009009",70,3);
        Review r1 = new Review("Amany", 5.0, "Excellent book ");
        Review r2 = new Review("jawahwr", 5.0, "Great book,");
        b1.addReview(r1);
        b1.addReview(r2);

//_____________________________________________________________________________________________

Movie m=new Movie("beautiful", "musod","kdk",20,102);
Movie m2=new Movie(" rush houre "," ebtehal ","456789",44,292);

//_________________________________________________________________________________________
Music mu=new Music(" ya mustajeb  "," mohmad abdo","56789",30,"mohamad abdo");
Music mu1=new Music(" YOM AQBLT"," MOHMAD ABDO "," 12345",80," Mhmad abdo");


        // إضافة الميديا إلى سلة المشتريات
        u.addToCart(b1);
        u.addToCart(m);
        u.addToCart(mu);
        u.checkout();
       //////////////////////////////////////////////////////
        u1.addToCart(b2);
        u1.addToCart(m2);
        u1.addToCart(mu);
        u1.checkout();
        ////////////////////////////////////////////

        // 'طباعة القيم التي في السلة
        System.out.println("Shopping Cart for " + u.getUsername());
        for (Media media : u.getShoppingCart()) {
            System.out.println(media.toString() + "  Type: " + media.getMediaType());
        }
        System.out.println("_________________________________________________________________________________-");
        System.out.println("Shopping Cart for " + u1.getUsername() );
        for (Media media : u1.getShoppingCart()) {
            System.out.println(media.toString() + " Type: " + media.getMediaType());
            System.out.println("_________________________________________________________________________________-");
            //_______________________________________________________________________


            // طباعة المشتريات
        }
        System.out.println("Purchased Items for " + u.getUsername() );
        for (Media media : u.getPurchasedMedia()) {
            System.out.println(media.toString() + " Type: " + media.getMediaType());}
        System.out.println("_________________________________________________________________________________-");
        System.out.println("Purchased Items for " + u1.getUsername() );
        for (Media media : u1.getPurchasedMedia()) {
            System.out.println(media.toString() + "  Type: " + media.getMediaType());}
        System.out.println("_________________________________________________________________________________-");

        // طباعة المتوسط
        System.out.println("Average Rating for '" + b1.getTitle() +  b1.getAvrageRating());
        System.out.println("Average Rating for '" + b2.getTitle() + b2.getAvrageRating());
        System.out.println("_________________________________________________________________________________-");
        // اتحقق اذا كان افضل مبيعا
        System.out.println("Is '" + b1.getTitle() + "' a Bestseller? " + b1.isBestSeller());
        System.out.println("Is '" + b2.getTitle() + "' a Bestseller? " + b2.isBestSeller());
//________________________________________________________________________________
        System.out.println("_________________________________________________________________________________-");
        b1.restock(5);
        b2.restock(3);
        System.out.println("\n" + b1.toString());
        System.out.println("\n" + b2.toString());
        System.out.println("_________________________________________________________________________________-");
        // التوصية
        System.out.println("\nRecommended Movies based on the director of 'Inception':");
     m.recommendSimilarMovies(List.of(m,m2));
        System.out.println("_________________________________________________________________________________-");
     //____________________________________________
        System.out.println("\nAvailable Media in Store:");
        store.displayMedias();
        System.out.println("_________________________________________________________________________________-");
//__________________________________________________________________
        Book searchedBook = store.searchBook(" Macbeth ");
        if (searchedBook != null) {
            System.out.println("\nFound Book: " + searchedBook.toString());
        } else {
            System.out.println("\nBook not found.");
        }
    }

















    }

