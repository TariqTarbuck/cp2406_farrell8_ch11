/**
 * Created by jc320680 on 26/09/17.
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction novel = new Fiction("The best book in the world");

        NonFiction notANovel = new NonFiction("KFC Menu");

        System.out.println("The fiction novel: " +novel.getBookTitle());
        System.out.println("A fiction novel costs: " + novel.getBookPrice());


        System.out.println("The non fiction novel: " +notANovel.getBookTitle());
        System.out.println("A non fiction novel costs: " +notANovel.getBookPrice());

    }

}
