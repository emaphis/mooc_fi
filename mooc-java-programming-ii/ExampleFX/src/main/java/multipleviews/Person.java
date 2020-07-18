
package multipleviews;

/**
 * Separating application logic and user interface logic
 * @author emaphis
 */
public class Person {
    private String name;
    private String socialSecurityNumber;

    public Person() {
        this.name = "";
        this.socialSecurityNumber = "";
    }

    public Person(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

}
