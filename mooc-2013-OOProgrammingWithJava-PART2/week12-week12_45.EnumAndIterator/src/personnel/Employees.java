
package personnel;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Employees {
    private final List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<Person>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public void add(List<Person> persons) {
        Iterator<Person> iter = persons.iterator();

        while (iter.hasNext()) {
            add(iter.next());
        }
    }


    public void print() {
        Iterator<Person> iter = persons.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }


    public void print(Education education) {
        Iterator<Person> iter = persons.iterator();

        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education)
            System.out.println(person);
        }
    }

    public void fire(Education education) {
        Iterator<Person> iter = persons.iterator();

        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education)
            iter.remove();
        }
    }

}
