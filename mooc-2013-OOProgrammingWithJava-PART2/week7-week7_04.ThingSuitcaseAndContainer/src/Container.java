
import java.util.List;
import java.util.ArrayList;


public class Container {
    private int maxWeight;
    private List<Suitcase> cases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = getWeight() + suitcase.totalWeight();
        if (getWeight() + suitcase.totalWeight() <= maxWeight) {
            cases.add(suitcase);
        }
    }

    public int getWeight() {
        int weight = 0;
        for (Suitcase suitcase : cases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Suitcase suitcase : cases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        if (cases.isEmpty())
            return "empty (" + getWeight() + " kg)";

        if (cases.size() == 1)
            return cases.size() + " suitcase (" + getWeight() + " kg)";

        return cases.size() + " suitcases (" + getWeight()+ " kg)";
    }

}
