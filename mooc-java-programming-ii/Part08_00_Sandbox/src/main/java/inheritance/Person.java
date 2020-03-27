/*
 * Week 9 Example
 */
package inheritance;


/**
 *
 * @author emaphis
 */
public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\n  " + address;
    }

}
