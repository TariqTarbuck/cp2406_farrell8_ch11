/**
 * Created by jc320680 on 26/09/17.
 */
public abstract class Book {

    String bookTitle = new String();
    double bookPrice;

    public Book(String t){
        bookTitle = t;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public double getBookPrice(){
        return bookPrice;
    }

    public abstract void setBookPrice();

}
