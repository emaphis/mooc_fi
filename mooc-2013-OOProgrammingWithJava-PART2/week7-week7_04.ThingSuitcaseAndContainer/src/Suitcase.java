
import java.util.ArrayList;
import java.util.List;


public class Suitcase {
    private int maxWeight;
    private List<Thing> things;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        int newWeight = totalWeight() + thing.getWeight();
        if (newWeight <= maxWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        if (things.size() > 0) {
            Thing thing = things.get(0);
            int lastWeight = thing.getWeight();
            for (Thing nextThing : things) {
                if (nextThing.getWeight() > thing.getWeight())
                    thing = nextThing;
            }
            return thing;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        if (things.isEmpty())
            return "empty (" + totalWeight() + " kg)";

        if (things.size() == 1)
            return things.size() + " thing (" + totalWeight() + " kg)";

        return things.size() + " things (" + totalWeight() + " kg)";
    }

}
