
import java.util.HashMap;
import java.util.Map;


public class BookApp {

    static void testBook() {
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

    static void testEquals() {
        Book objectBook = new Book("Objectbook", 2000);
        Book anotherObjectBook = new Book("Objectbook", 2000);

        if (objectBook.equals(anotherObjectBook)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are not the same");
        }
    }

    static void testHashCode() {
        HashMap<Book, String> loaners = new HashMap<Book, String>();

        Book objectbook = new Book("Objectbook", 2000);
        loaners.put( objectbook, "Pekka" );
        loaners.put( new Book("Test Driven Development",1999), "Arto" );

        // can only find if a valid hashCode method is implemented
        System.out.println(loaners.get( objectbook));
        System.out.println(loaners.get(new Book("Objectbook", 2000)));
        System.out.println(loaners.get(new Book("Test Driven Development", 1999)));
    }
 
    public static void main(String[] args) {
        testBook();
        testEquals();
        testHashCode();
    }
}
