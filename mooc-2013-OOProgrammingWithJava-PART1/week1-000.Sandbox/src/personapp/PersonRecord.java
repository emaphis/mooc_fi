
package personapp;

import java.util.Collection;


public interface PersonRecord {
    void recored(Person person);
    Person get(String id);

    void delete(Person person);
    void delete(String id);

    Collection<Person> getAll();
}
