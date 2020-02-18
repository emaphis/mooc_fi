
public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        value = value + 1;

        if (value >= limit) {
            value = 0;
        }
    }

    public int value() {
        return value;
    }

    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }

        return "" + value;
    }


}
