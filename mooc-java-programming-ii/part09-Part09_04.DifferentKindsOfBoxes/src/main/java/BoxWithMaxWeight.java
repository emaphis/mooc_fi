
import java.util.ArrayList;


/**
 *
 * @author emaphis
 */
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (getTotalWeight() + item.getWeight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    private int getTotalWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }

        return weight;
    }
}
