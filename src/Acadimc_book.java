public class Acadimc_book extends Book {
    private String subject;


    Acadimc_book(String title, String auteur, String isbn, double prise,int quantitystock,String subject) {
        super(title, auteur, isbn, prise,quantitystock);
        this.subject=subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMediaType() {
        return isBestSeller() ? "Bestselling AcademicBook" : "AcademicBook";
    }
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }








}
