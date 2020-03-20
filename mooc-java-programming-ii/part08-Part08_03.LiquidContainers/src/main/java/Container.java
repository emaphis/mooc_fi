
/**
 *
 * @author emaphis
 */
public class Container {
    private int capacity;
    private int amount;
    private String name;

    public Container(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public int add(int change) {
        if (change < 0) {
            return 0;
        } else if (amount + change <= capacity) {
            amount += change;
            return change;
        } else {  // addition will go over max capacity;
            int newChange =  (amount + change) - capacity;
            amount = capacity;
            return newChange;
        }
    }

    public int remove(int change) {
        if (change < 0) {
            return 0;
        } else if (amount - change >= 0) {
            amount -= change;
            return change;
        } else {  // subtraction will go below 0
            int newChange = amount;
            amount = 0;
            return newChange;
        }
    }

    @Override
    public String toString() {
        return name + ": " + amount + "/" + capacity;
    }

}
