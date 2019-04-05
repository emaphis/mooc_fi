
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ContainerHistory {
    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        return Collections.max(history);
    }

    public double minValue() {
        return Collections.min(history);
    }

    public double average() {
        if (history.isEmpty())
            return 0.0;

        double total = 0.0;
        for (Double situation : history) {
            total += situation;
        }

        return total / history.size();
    }

    public double greatestFluctuation() {
        if (history.isEmpty() || history.size() == 1)
            return 0.0;

        double maxFlux = 0.0;
        double flux;
        for (int i = 0; i < history.size() - 1; i++) {
            flux = Math.abs(history.get(i) - history.get(i+1));
            maxFlux = Math.max(flux, maxFlux);
        }

        return maxFlux;
    }


    public double variance() {
        if (history.isEmpty() || history.size() == 1)
            return 0.0;

        double avg = average();
        double var = 0.0;
        for (Double sample : history) {
            var += (sample - avg) * (sample - avg);
        }

        return var / (history.size() - 1);
    }

}
