
import java.util.ArrayList;
import java.util.List;

public class Box implements ToBeStored {
    private List<ToBeStored> stuff;
    private double maximumWeight;

    public Box(double maximumWeight) {
        this.stuff = new ArrayList<ToBeStored>();
        this.maximumWeight = maximumWeight;
    }

    public void add(ToBeStored thing) {
        double weight = weight() + thing.weight();
        if (weight <= maximumWeight) {
            stuff.add(thing);
        }
    }

    @Override
    public double weight() {
        double weight = 0.0;
        for (ToBeStored thing : stuff) {
            weight += thing.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + stuff.size() + " things, total weight " + weight() + " kg";
    }

}
