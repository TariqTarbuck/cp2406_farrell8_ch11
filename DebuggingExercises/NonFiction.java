/**
 * Created by jc320680 on 26/09/17.
 */
    public class NonFiction extends Book {
        public NonFiction(String bookTitle){
            super(bookTitle);
            setBookPrice();
        }
        public void setBookPrice()
        {
            super.bookPrice = 37.99;

        }
}
