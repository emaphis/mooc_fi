
package generics;

/**
 *
 * @author emaphis
 */
public class List2<Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List2() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        values[firstFreeIndex] = value;
        firstFreeIndex++;
    }
}
