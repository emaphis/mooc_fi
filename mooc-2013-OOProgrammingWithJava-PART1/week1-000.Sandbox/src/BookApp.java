
import java.util.HashMap;
import java.util.Map;


public class BookApp {

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        bookCollection.put(senseAndSensibility.getName(), senseAndSensibility);
        bookCollection.put(prideAndPrejudice.getName(), prideAndPrejudice);

        Book book = bookCollection.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = bookCollection.get("Pride and Prejudice");
        System.out.println(book);
    }
}
