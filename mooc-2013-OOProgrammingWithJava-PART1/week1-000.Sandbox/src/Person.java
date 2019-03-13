
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String intialName, int initialAge) {
        this.age = initialAge;
        this.name = intialName;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String initialName) {
        this(initialName, 0);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public void becomeOlder() {
        becomeOlder(1);
    }

    public void becomeOlder(int years) {
        age += years;
    }
    
    public boolean isAdult() {
        return this.age >= 18;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double weightIndex() {
        double heightInMeters = this.height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
}
