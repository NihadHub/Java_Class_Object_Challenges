import java.util.ArrayList;
public class Book extends Object {
    public String Title;
    public String Author;
    public double price ;

    public Book(String Title,String Author,double price){
        this.Title= Title;
        this.Author= Author;
        this.price= price;
    }
     @Override
     public String toString(){
        return Title + " de " + Author + "(" + price + "MAD)";
     };

    public void displayAll(){
        System.out.println("Book title: "+Title);
        System.out.println("Book author: "+Author);
        System.out.println("Book price: "+price+ "MAD");

    }

    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        books.add( new Book("Milk and Honey","Rupi Kaur", 100));
        books.add(new Book ("The Black Cat","Nathaniel Hawthorn", 60));
        books.add( new Book("The Scarlette Letter","Rupi Kaur", 58));
        for(Book b:books){
            System.out.println(b);
        }
    }
}
