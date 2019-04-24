
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;


public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return peopleIdentities.get(o2) - peopleIdentities.get(o1);
    }

}
