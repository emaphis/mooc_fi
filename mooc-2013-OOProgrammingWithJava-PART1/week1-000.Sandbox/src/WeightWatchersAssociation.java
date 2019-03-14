
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

    public Person personWithHighestWeightIndex() {
        // if members is empty, we'll return the null reference
        if (members.isEmpty()) {
            return null;
        }

        Person heaviestSoFar = members.get(0);

        for (Person person : members) {
            if (person.weightIndex() > heaviestSoFar.weightIndex()) {
                heaviestSoFar = person;
            }
        }

        return heaviestSoFar;
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
