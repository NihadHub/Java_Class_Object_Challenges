public class Movie {
    public String title;
    public int rating;

    public Movie(String title, int rating ){
        this.title = title;
        this.rating= rating;
    }
    public void displayAll(){
        System.out.println("Movie name: "+ title);
        if(rating>8){
            System.out.println("Exellent");
        } else if (rating >5 && rating<8) {
            System.out.println("Good");
        }else {
            System.out.println("Poor");
        }
    }

    public static void main(String[] args){
        Movie movie1 = new Movie("CenderElla", 1000);
        movie1.displayAll();
    }
}
