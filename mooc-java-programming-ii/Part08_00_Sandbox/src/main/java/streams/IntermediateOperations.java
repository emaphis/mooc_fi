/*
 * Week 10 Example
 */
package streams;

import java.util.ArrayList;

/**
 * filter, map, distinct, sorted
 * @author emaphis
 */
public class IntermediateOperations {
    public static void main(String[] args) {
        filterExample();
    }

    private static void filterExample() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Fred", "Bird", 2005));
        persons.add(new Person("John", "Goldberg", 2006));
        persons.add(new Person("Gina", "Smith", 2006));
        persons.add(new Person("John", "Bench", 2004));
        persons.add(new Person("Alberto", "Sanchez", 2007));

        long count = persons.stream()
                .filter(person -> person.getBirthYear() < 2006)
                .count();
        System.out.println("Count: " + count);

        count = persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .count();
        System.out.println("Count: " + count);

        persons.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}
