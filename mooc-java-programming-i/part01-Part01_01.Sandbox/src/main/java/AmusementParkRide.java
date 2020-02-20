

/**
 * Part 5 example.
 * @author emaphis
 */
public class AmusementParkRide {
    private String name;
    private int lowestHight;
    private int visitors;

    public AmusementParkRide(String name, int lowestHight) {
        this.name = name;
        this.lowestHight = lowestHight;
        this.visitors = 0;
    }

    public boolean allowedToRide(Person2 person) {
         if (person.getHeight() < lowestHight) {
             return false;
         }

         visitors++;
         return true;
    }

    @Override
    public String toString() {
        return name + ", minumum height: " + lowestHight +
                ", visitors: " + visitors;
    }
}
