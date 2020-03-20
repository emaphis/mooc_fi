/**
 *
 * @author emaphis
 */
public class Container {
    private int contains = 0;

    public int contains() {
        return contains;
    }

    public void add(int amount) {
        if (amount < 0) return;

        if (contains + amount <= 100) {
            contains += amount;
        } else {
            contains = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) return;

        if (contains - amount > 0) {
            contains -= amount;
        } else {
            contains = 0;
        }
    }

    @Override
    public String toString() {
        return contains + "/100";
    }

}
