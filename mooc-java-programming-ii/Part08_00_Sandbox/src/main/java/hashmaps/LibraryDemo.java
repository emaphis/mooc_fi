/*
 * Week 8
 */
package hashmaps;

/**
 *
 * @author emaphis
 */
public class LibraryDemo {

    public static void main(String[] args) {
        example1();
    }

    static void example1() {
        Book senseAndSensibility = new Book("Sense and Sensibility", "....", 1811);
        Book prideAndPredujice = new Book("Pride and Prejudice", "...", 1813);

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPredujice);

        System.out.println(library.getBook("pride and prejudice"));
        System.out.println();

        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        System.out.println();

        System.out.println(library.getBook("SENSE"));
    }
}
