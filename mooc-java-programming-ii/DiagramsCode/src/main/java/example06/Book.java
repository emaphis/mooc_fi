
package example06;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private String name;
    private String publisher;
    private List<Person> authors;

    public Book(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
        this.authors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public void addAuthor(Person author) {
        authors.add(author);
    }

}
