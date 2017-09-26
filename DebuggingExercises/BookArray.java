public class BookArray {
    public static void main(String[] args) {

        Book aBook[] = new Book[10];
        int count;

        aBook[0] = new Fiction("The best book in the world");
        aBook[1] = new Fiction("The best book in the world vol 21");
        aBook[2] = new Fiction("The best book in the world vol 22");
        aBook[3] = new Fiction("The best book in the world vol 45");
        aBook[4] = new Fiction("The best book in the world vol 45.2");
        aBook[5] = new Fiction("The best book in the world vol 89");
        aBook[6] = new Fiction("The best book in the world vol 90");
        aBook[7] = new NonFiction("The best book in the world vol 45");
        aBook[8] = new Fiction("The best book in the world vol 34");
        aBook[9] = new NonFiction("The best book in the world vol 10");

        for (count = 0; count < aBook.length; ++count){
            System.out.println("Book: "+aBook[count].getBookTitle()
                    +"Costs: $"+aBook[count].getBookPrice());
        }


    }
}
