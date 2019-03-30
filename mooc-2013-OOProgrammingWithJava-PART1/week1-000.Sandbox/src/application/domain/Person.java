
package application.domain;


public class Person implements Identifiable, Comparable<Identifiable>  {
    private final String name;
    private final String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPersonId() {
        return id;
    }

    @Override
    public String getID() {
        return getPersonId();
    }

    @Override
    public String toString() {
        return name + " ID: " + getID();
    }

    @Override
    public int compareTo(Identifiable other) {
        return this.getID().compareTo(other.getID());
    }

}
