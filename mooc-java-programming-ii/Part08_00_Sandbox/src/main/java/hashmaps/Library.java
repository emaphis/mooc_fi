/*
 * Week 8
 */
package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author emaphis
 */
public class Library {
    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = sanitizeString(book.getName());

        if (directory.containsKey(name)) {
            System.out.println("Book is already in the library");
        } else {
            directory.put(name, book);
        }
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizeString(bookTitle);
        return directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizeString(bookTitle);

        if (directory.containsKey(bookTitle)) {
            directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot remove!");
        }
    }

    // Goint Through a hash map's keys

    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizeString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for (String bookTitle : directory.keySet()) {
            if (!bookTitle.contains(titlePart)) {
                continue;
            }

            books.add(directory.get(bookTitle));
        }

        return books;
    }

    public ArrayList<Book> getBookByPart2(String titlePart) {
        titlePart = sanitizeString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for (Book book : directory.values()) {
            if (!book.getName().contains(titlePart)) {
                continue;
            }

            books.add(book);
        }
        return books;
    }

    // Utilities

    public static String sanitizeString(String str) {
        if (str == null) {
            return "";
        }

        str = str.toLowerCase();
        return str.trim();
    }
}
