
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> collection;

    public Library() {
        this.collection = new HashMap<String, Book>();
    }

    public void addBook(Book book) {
        String name = StringCleaner(book.getName());

        if(this.collection.containsKey(name)) {
            System.out.println("The book is already in the libary");
        } else {
            collection.put(name, book);
        }
    }

    void removeBook(String bookName) {
        bookName = StringCleaner(bookName);

        if (collection.containsKey(bookName)) {
            collection.remove(bookName);
        } else {
            System.out.println("The book was not found, you can't remove it!");
        }
    }

    public ArrayList<Book> bookList() {
        return new ArrayList<Book>(collection.values());
    }

    private String StringCleaner(String string) {
        if (string == null)
            return "";

        string = string.toLowerCase();
        return string.trim();
    }
}
