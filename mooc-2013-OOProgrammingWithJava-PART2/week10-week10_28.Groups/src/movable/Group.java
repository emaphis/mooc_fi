
package movable;

import java.util.ArrayList;
import java.util.List;


public class Group implements Movable {
    private List<Movable> items;

    public Group() {
        this.items = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        items.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable item : items) {
            item.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (Movable item : items) {
            str += item.toString() + "\n";
        }
        return str;
    }

}
