import java.util.List;

public class Music extends Media{
private String artist;

    Music(String title, String auteur, String isbn, double prise,String artist) {
        super(title, auteur, isbn, prise);
        this.artist=artist;}


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }



    public void listen(User user) {
        user.addPurchasedMedia(this);
    }
    public void generatePlaylist(List<Music> musicCatalog) {
        for (Music music : musicCatalog) {
            if (music.getAuteur().equals(this.getAuteur())) {
                System.out.println("Recommended Music: " + music.getTitle());
            }
        }
    }
    public String getMediaType() {
        return getPrise() >= 10 ? "Premium Music" : "Music";
    }


    public String toString() {
        return super.toString() + ", Artist: " + artist;
    }







}
