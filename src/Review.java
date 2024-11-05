public class Review {
private String username;
private double rating;
private String comment;

Review(String username,double rating,String comment){
   this.username=username;
   this.rating=rating;
   this.comment=comment;
}

public void setUsername(){
    this.username=username;
}
 public void setRating(){
    this.rating=rating;
 }

 public void setComment(){
    this.comment=comment;
 }

 public String getUsername(){
    return username;
 }
 public String getComment(){
    return comment;
 }

public double getRating(){

    return rating;
}








}
