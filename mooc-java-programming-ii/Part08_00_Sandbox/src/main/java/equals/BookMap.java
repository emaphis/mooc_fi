package equals;

import java.util.HashMap;

/**
 *
 * @author emaphis
 */
public class BookMap {

    public static void main(String[] args) {
        example1();
    }

    static void example1() {
        HashMap<Book, String> borrowers = new HashMap<>();

        Book bookObject = new Book("Book Object", 2000, "...");
        borrowers.put(bookObject, "Pekka");
        borrowers.put(new Book("Test Driven Development", 1999, "..."), "Arto");

        System.out.println(borrowers.get(bookObject));
        System.out.println(borrowers.get(new Book("Book Object", 2000, "...")));
        System.out.println(borrowers.get(new Book("Test Driven Development", 1999, "...")));
    }

}
