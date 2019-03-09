
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String intialName) {
        this.age = 0;
        this.name = intialName;
        this.weight = 0;
        this.height = 0;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public void becomeOlder() {
        this.age++; 
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDividedByHundred = this.height / 100.0;
        return weight / (heightDividedByHundred * heightDividedByHundred);
    }


}
