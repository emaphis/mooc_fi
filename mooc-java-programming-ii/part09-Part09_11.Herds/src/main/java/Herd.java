
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author emaphis
 */
public class Herd implements Movable {
    private List<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String out = "";
        for (Movable movable : movables) {
            out += movable.toString() + "\n";
        }
        return out;
    }


}
