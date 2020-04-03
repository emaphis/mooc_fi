/*
 * Week 10 Example
 */
package comparable;

/**
 *
 * @author emaphis
 */
public class Person {
    private int birthYear;
    private String name;

    public Person(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

}
