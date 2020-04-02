/*
 * Week 10 Examples
 */
package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Objects and Streams
 * @author emaphis
 */
public class ObjectsStreams {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(new Person("Mark", "Twain", 1811), "Tom Sawyerr", 1879));
        books.add(new Book(new Person("JK", "Rowling", 1965), "Harry Potter, Prince of Theives", 1995));
        books.add(new Book(new Person("JK", "Rowling", 1965), "Harry Potter, The shaddowed hall", 1996));

        books.stream()
                .filter(book -> book.getName().contains("Potter"))
                .map(book -> book.getAuthor())
                .forEach(author -> System.out.println(author));
    }
}
