/*
 * Week 8
 */
package hashmaps;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class BookExample {

    public static void main(String[] args) {
//        example1();
//        System.out.println();
        example2();
    }

    static void example1() {
        HashMap<String, Book> directory = new HashMap<>();
        Book senseAndSensiblilty = new Book("Sense and Sensibility", "...", 1811);
        Book prideAndPredujice = new Book("Pride and Prejudice", "...", 1913);
        System.out.println(senseAndSensiblilty);
        System.out.println(prideAndPredujice);
        System.out.println();

        directory.put(senseAndSensiblilty.getName(), senseAndSensiblilty);
        directory.put(prideAndPredujice.getName(), prideAndPredujice);

        Book book = directory.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book);
    }

    static void example2() {
        ArrayList<Book> books = new ArrayList<>();

        Book senseAndSensibility = new Book("Sense and Sensibility", "...", 1811);
        Book prideAndPrejudice = new Book("Pride and Prejudice", "....", 1813);
        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);

// searching for a book named Sense and Sensibility
        Book match = null;
        for (Book book : books) {
            if (book.getName().equals("Sense and Sensibility")) {
                match = book;
                break;
            }
        }

        System.out.println(match);
        System.out.println();

// searching for a book named Persuasion
        match = null;
        for (Book book : books) {
            if (book.getName().equals("Persuasion")) {
                match = book;
                break;
            }
        }

        System.out.println(match);
    }
}
