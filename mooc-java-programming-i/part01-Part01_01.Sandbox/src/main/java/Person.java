

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = height / 100.0;
        return weight / (heigthPerHundred * heigthPerHundred);
    }

    @Override
    public String toString() {
        return name + ", age " + age + " years ";
    }

    // growOlder() method has been added
    public void growOlder() {
        if (age < 30) {
            this.age = this.age + 1;
        }
    }

    public int returnAge() {
        return age;
    }

    public boolean isOfLegalAge() {
        if (age < 18) {
            return false;
        }

        return true;
    }

    public String getName() {
        return name;
    }

}
