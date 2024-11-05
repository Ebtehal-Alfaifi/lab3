import java.util.List;

public class Movie extends Media{
    private int duration;


    Movie(String title, String auteur, String isbn, double prise,int duration) {
        super(title, auteur, isbn, prise);
        this.duration=duration;
    }
    public void setDuration(){
        this.duration=duration;
    }

    public int getDuration(){

        return duration;
    }



    public void watch(User user){
        user.addPurchasedMedia(this);}


    public void recommendSimilarMovies(List<Movie> movieCatalog) {
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                System.out.println("Recommended Movie: " + movie.getTitle());
            }
        }
    }
    public String getMediaType() {
        return duration >= 120 ?"long movie":"Movie";
    }
    public String toString() {
        return super.toString() + ", Duration: " + duration + " minutes";
    }







}
