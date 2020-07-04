
package generics;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class GeneralList<T> implements List1<T> {
    private ArrayList<T> values;

    public GeneralList() {
        this.values = new ArrayList<>();
    }

    @Override
    public void add(T value) {
        values.add(value);
    }

    @Override
    public T get(int index) {
        return values.get(index);
    }

    @Override
    public T remove(int index) {
        T value = values.get(index);
        values.remove(index);
        return value;
    }

}
