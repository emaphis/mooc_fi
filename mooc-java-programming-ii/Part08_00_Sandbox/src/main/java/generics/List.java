
package generics;

/**
 *
 * @author emaphis
 */
public interface List<T> {
    void add(T value);
    T get(int index);
    T remove(int index);
}
