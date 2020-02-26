
import java.util.ArrayList;

/**
 * Part 6 example.
 * @author emaphis
 */
public class AmusementParkRide2 {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person2> riding;

    public AmusementParkRide2(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean isAllowedOn(Person2 person) {
         if (person.getHeight() < minimumHeight) {
             return false;
         }

         visitors++;
         riding.add(person);
         return true;
    }

    public void removeEveryoneOnRide() {
        riding.clear();
    }

    public double averageHeightOfPeopleOnRide() {
        if (riding.isEmpty()) {
            return -1;
        }

        int sumOfHeights = 0;
        for (Person2 person : riding) {
            sumOfHeights += person.getHeight();
        }

        return 1.0 * sumOfHeights / riding.size();
    }

    public Person2 getTallest() {
        if (riding.isEmpty()) {
            return null;
        }

        Person2 returnObject = riding.get(0);

        for (Person2 person : riding) {
            if (returnObject.getHeight() < person.getHeight()) {
                returnObject = person;
            }
        }

        return returnObject;
    }

    @Override
    public String toString() {
        String onTheRide = "";
        for (Person2 person : riding) {
            onTheRide = onTheRide + person.getName() + "\n";
        }

        return name + ", minumum height requirement: " + minimumHeight +
                ", visitors: " + visitors + "\n" +
                "riding:\n" + onTheRide;
    }
}
