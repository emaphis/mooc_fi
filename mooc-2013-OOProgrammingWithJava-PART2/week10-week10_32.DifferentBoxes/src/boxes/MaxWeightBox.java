
package boxes;

import java.util.ArrayList;
import java.util.List;


public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    private int getTotalWeight() {
        int tot = 0;
        for (Thing thing : things) {
            tot += thing.getWeight();
        }
        return tot;
    }


    @Override
    public void add(Thing thing) {
        if (getTotalWeight() + thing.getWeight() <= maxWeight)
            things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }

}
