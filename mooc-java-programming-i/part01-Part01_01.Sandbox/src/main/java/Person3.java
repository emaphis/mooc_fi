

/**
 * Person class for week 5.
 * @author emaphis
 */
public class Person3 {
    private String name;
    private SimpleDate birthday;
    private double weight;
    private double height;

    public Person3(String name, SimpleDate birthday) {
        this(name, birthday, 0, 0);
    }

    public Person3(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person3(String name, SimpleDate birthday, double weight, double height) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson() {
        System.out.println(name + " was born on " + birthday);
    }

    public double bodyMassIndex() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    @Override
    public String toString() {
        return name + ", born on " + birthday;
    }

    public String getName() {
        return name;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public boolean olderThan(Person3 compared) {
        return birthday.before(compared.birthday);
    }
}
