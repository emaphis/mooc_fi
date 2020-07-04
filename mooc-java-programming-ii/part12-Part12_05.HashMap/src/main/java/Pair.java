
/**
 *
 * @author emaphis
 * @param <K>
 * @param <V>
 */
public class Pair<K, V> {
    private final K key;
    private V value;

    public Pair(K first, V value) {
        this.key = first;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
