/**
 * Created by jc320680 on 26/09/17.
 */
public class Fiction extends Book {
    public Fiction(String bookTitle){
        super(bookTitle);
        setBookPrice();
    }
    public void setBookPrice()
    {
        super.bookPrice = 24.99;

    }
}
