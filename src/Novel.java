public class Novel extends Book{
private String genre;

    Novel(String title, String auteur, String isbn, double prise, int stock,String genre) {
        super(title, auteur, isbn, prise, stock);
        this.genre=genre;
    }


    public void setGenre(){
        this.genre=genre;
    }


    public String getGenre(){
        return genre;
    }
    public String getMediaType() {
        return isBestSeller() ? "Bestselling Novel" : "Novel";
    }

    @Override
    public String toString() {
        return super.toString() + ", Genre: " + genre;
    }
}






