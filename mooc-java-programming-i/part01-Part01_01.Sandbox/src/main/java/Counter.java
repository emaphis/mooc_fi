
/**
 * Part 5.
 * @author emaphis
 */
public class Counter {
    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void increase() {
        value++;
    }

    @Override
    public String toString() {
        return "value: " + value;
    }

    public Counter clone() {
        Counter clone = new Counter(value);
        return clone;
    }
}
