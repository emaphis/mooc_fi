

/**
 * Person class for week 5.
 * @author emaphis
 */
public class Person2 {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person2(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public double bodyMassIndex() {
        return weight / (height * height);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }

    @Override
    public String toString() {
        return name + ", BMI: " + bodyMassIndex()
                + ", maximum heart rate: " + maximumHeartRate();
    }

}
