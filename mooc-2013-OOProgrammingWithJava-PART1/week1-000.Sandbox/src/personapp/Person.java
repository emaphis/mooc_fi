
package personapp;


public class Person {
    private final String name;
    private final String ID;

    public Person(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

}
