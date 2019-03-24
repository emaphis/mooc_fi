
import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {
    private Map<String, Double> notes;

    public PromissoryNote() {
        this.notes = new HashMap<String, Double>();
    }

    public void setLoan(String toWhome, double value) {
        notes.put(toWhome, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (notes.containsKey(whose))
            return notes.get(whose);

        return 0.0;
    }

}
