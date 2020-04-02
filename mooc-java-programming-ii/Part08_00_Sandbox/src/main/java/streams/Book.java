/*
 * Week 10 Example
 */
package streams;

/**
 *
 * @author emaphis
 */
public class Book {
    private Person author;
    private String name;
    private int pages;

    public Book(Person author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public Person getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

}
