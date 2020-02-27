
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class Hold {
    private ArrayList<Suitcase> suitecases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitecases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWieght() <= maximumWeight) {
            suitecases.add(suitcase);
        }
    }

    public int totalWieght() {
        int sumWeight = 0;
        for (Suitcase suitecase : suitecases) {
            sumWeight += suitecase.totalWeight();
        }
        return sumWeight;
    }

    public void printItems() {
        for (Suitcase suitecase : suitecases) {
            suitecase.printItems();
        }
    }

    @Override
    public String toString() {
        return suitecases.size() + " suitcases (" + totalWieght() + " kg)";
    }
}
