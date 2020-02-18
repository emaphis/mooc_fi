

/**
 * Person class for week 5.
 * @author emaphis
 */
public class Person2 {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person2(String name) {
        this(name, 0);
    }

    public Person2(String name, int age) {
        this(name, age, 0, 0);
    }

    public Person2(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson() {
        System.out.println(name + " is " + age + " years old");
    }

    public void growOlder() {
        growOlder(1);
    }

    public void growOlder(int years) {
        age += years;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public double bodyMassIndex() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }

    public String getBMI() {
        return name + ", BMI: " + bodyMassIndex()
                + ", maximum heart rate: " + maximumHeartRate();
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
}
