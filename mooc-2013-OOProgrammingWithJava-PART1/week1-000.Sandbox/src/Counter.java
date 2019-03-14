
public class Counter {
    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int value) {
        this.value = value;
    }

    public void grow() {
        value++;
    }

    public Counter clone() {
        Counter clone = new Counter(value);
  
        return clone;
    }

    @Override
    public String toString() {
        return "value: " + value;
    }
}
