
import java.util.ArrayList;


/**
 *
 * @author emaphis
 */
public class Pipe<T> {
    private ArrayList<T> list;

    public Pipe() {
        this.list = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        list.add(value);
    }

    public T takeFromPipe() {
        T item = null;
        if (isInPipe()) {
            item = list.get(0);
            list.remove(0);
        }
        return item;
    }

    public boolean isInPipe()  {
        return !list.isEmpty();
    }
}
