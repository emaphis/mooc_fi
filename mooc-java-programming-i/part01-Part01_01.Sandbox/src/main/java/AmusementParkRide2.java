

/**
 * Part 5 example.
 * @author emaphis
 */
public class AmusementParkRide2 {
    private String name;
    private int minimumHeight;
    private int visitors;

    public AmusementParkRide2(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
    }

    public boolean IsAllowedOn(Person2 person) {
         if (person.getHeight() < minimumHeight) {
             return false;
         }

         visitors++;
         return true;
    }

    @Override
    public String toString() {
        return name + ", minumum height requirement: " + minimumHeight +
                ", visitors: " + visitors;
    }
}
