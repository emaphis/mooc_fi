
import java.util.ArrayList;

public class WeightWatchersAssociation {
    private double lowestWeightIndex;
    private String name;
    private ArrayList<Person> members;

    public WeightWatchersAssociation(double lowestWeightIndex) {
        this.lowestWeightIndex = lowestWeightIndex;
    }

    public WeightWatchersAssociation(String name, double lowestWeightIndex) {
        this.lowestWeightIndex = lowestWeightIndex;
        this.name = name;
        this.members = new ArrayList<Person>();
    }


    public boolean isAcceptedAsMember(Person person) {
        if (person.weightIndex() < lowestWeightIndex) {
            return false;
        }

        return true;
    }

    public void addAsMember(Person person) {
        if (!isAcceptedAsMember(person)) {  // same as isAccepted(person) == false
            return;
        }
  
        this.members.add(person);
    }

    @Override
    public String toString() {
        String membersAsString = "";

        for (Person member : this.members) {
            membersAsString += " " + member.getName() + " ";
        }

        return "WeightWatchers association " + name + " members: " + membersAsString;
    }
}
