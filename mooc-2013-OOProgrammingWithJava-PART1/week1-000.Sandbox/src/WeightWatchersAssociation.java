
public class WeightWatchersAssociation {
    private double lowestWeightIndex;

    public WeightWatchersAssociation(double indexLimit) {
        this.lowestWeightIndex = indexLimit;
    }

    public boolean isAcceptedAsMember(Person person) {
        if (person.weightIndex() < lowestWeightIndex) {
            return false;
        }

        return true;
    }
}
