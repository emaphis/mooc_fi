
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String value) {
        list.add(value);
    }

    public ArrayList<String> values() {
        return list;
    }

    public String take() {
        if (list.size() >= 1) {
            int pos = list.size() - 1;
            String value = list.get(pos);
            list.remove(pos);
            return value;
        } else {
            return null;
        }
    }
}
