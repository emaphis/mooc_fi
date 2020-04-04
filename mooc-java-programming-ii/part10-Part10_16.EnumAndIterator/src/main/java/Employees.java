
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author emaphis
 */
public class Employees {
    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iter = peopleToAdd.iterator();
        while (iter.hasNext()) {
            list.add(iter.next());
        }
    }

    public void print() {
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person person = iter.next();
            if (person.getEducation() == education) {
                iter.remove();
            }
        }
    }
}
