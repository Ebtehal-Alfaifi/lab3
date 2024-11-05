public class Media {
    private String title;
    private String auteur;
    private String isbn;
    private double prise;

    Media(String title, String auteur, String isbn, double prise) {
this.title=title;
this.auteur=auteur;
this.isbn=isbn;
this.prise=prise;
    }

    public void setTitle(){
        this.title=title;
    }
public void setAuteur(){
        this.auteur=auteur;
}

public void setIsbn(){
        this.isbn=isbn;
}
public void setPrise(){
        this.prise=prise;
}

public String getTitle(){
   return title;
}
public String getAuteur(){
        return auteur;
}
public String getIsbn(){
        return isbn;
}
public double getPrise(){

    return prise;
}



    public String getMediaType() {
        return "Media";
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + auteur + ", ISBN: " + isbn + ", Price: " + prise;
    }
}




