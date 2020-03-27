
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        double max = history.get(0);
        for (Double status : history) {
            if (status > max) {
                max = status;
            }
        }
        return max;
    }

    public double minValue() {
        double min = history.get(0);
        for (Double status : history) {
            if (status < min) {
                min = status;
            }
        }
        return min;
    }

    public double average() {
        if (history.size() > 0) {
            double sum = 0;
            for (Double status : history) {
                sum += status;
            }
            return sum / history.size();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return history.toString();
    }

}
