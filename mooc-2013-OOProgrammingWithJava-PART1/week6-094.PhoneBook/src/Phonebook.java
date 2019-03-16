
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list;

    public Phonebook() {
        this.list  = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        list.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : list) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        String number = "number not known";

        for (Person person : list) {
            if (person.getName().equals(name)) {
                number = person.getNumber();
            }
        }

        return number;
    }
}
