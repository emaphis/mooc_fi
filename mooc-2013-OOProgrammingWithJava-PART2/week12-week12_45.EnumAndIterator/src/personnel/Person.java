
package personnel;


public class Person {
    private final String name;
    private final Education title;

    public Person(String name, Education title) {
        this.name = name;
        this.title = title;
    }

    public Education getEducation() {
        return title;
    }

    @Override
    public String toString() {
        return name + ", " + title;
    }

}
