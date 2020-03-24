package equals;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class BookApp {

    static void example1() {
        Book bookObject = new Book("Book object", 2000, "...");
        Book anotherBookObject = bookObject;

        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books weren't the same");
        }

        // create an object with the smae content that's nontheless its own object.
        anotherBookObject = new Book("Book object", 2000, "...");

        if (bookObject.equals(anotherBookObject)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books weren't the same");
        }
    }

    static void example2() {
        ArrayList<Book> books = new ArrayList<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        books.add(bookObject);

        if (books.contains(bookObject)) {
            System.out.println("Book Object was found.");
        }

        bookObject = new Book("Book Object", 2000, "...");

        if (!books.contains(bookObject)) {
            System.out.println("Book Object was not found.");
        }
    }

    public static void main(String[] args) {
        example1();
        example2();
    }
}
