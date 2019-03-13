
public class Counter {
    private int cntr;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.cntr = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return cntr;
    }

    public void increase() {
        increase(1);
    }

    public void increase(int increasAmount) {
        if (increasAmount > 0) {
            cntr += increasAmount;
        }
    }

    public void decrease() {
        decrease(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return;
        }

        cntr -= decreaseAmount;

        if (check && cntr < 0) {
            cntr = 0;
        }
    }

}
