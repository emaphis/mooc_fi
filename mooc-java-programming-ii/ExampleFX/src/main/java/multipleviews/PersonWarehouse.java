
package multipleviews;

import java.util.Collection;

/**
 * Separating application logic and user interface logic
 * @author emaphis
 */
public interface PersonWarehouse {
    void save(Person person);
    Person search(String socialSecurityNumber);

    void delete(Person person);
    void delete(String socialSecurityNumber);
    void deleteAll();

    Collection<Person> getAll();
}
