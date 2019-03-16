
public class Person {
    private String name;
    private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return name + " number: " + number;
    }

    public void changeNumber(String number) {
        this.number = number;
    }
}
