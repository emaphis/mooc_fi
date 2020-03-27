/*
 * Week 9 Example
 */
package inheritance;

/**
 *
 * @author emaphis
 */
public class PersonApp {

    public static void main(String[] args) {
        example1();
        System.out.println("ooooooo");
        example2();
    }

    // The actual type of an object dictates which method is executed.
    static void example1() {
        Person ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angesles 90028");
        // ollie.creadits();  // doesn't compile
        // ollie.study();   // doesn't compile
        System.out.println(ollie);  // Student.toString();
    }

    // Polymorphism
    static void example2() {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);
        Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollieObject);

        Object alice = new Student("Alice", "177 Stewart Ave. Farmington, ME 04938");
        System.out.println(alice);
    }
}
