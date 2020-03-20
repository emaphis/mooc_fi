
import java.util.ArrayList;


/**
 *
 * @author emaphis
 */
public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void remove(int number) {
        list.remove(number-1);
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ": " + list.get(i));
        }
    }

}
