
public class HealthStation {
    private int weighings;

    public HealthStation() {
        weighings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighings++;
        return person.getWeight();
    }

    public void feed(Person p) {
        int weight = weigh(p);
        weight++;
        p.setWeight(weight);
    }

    public int weighings() {
        return weighings;
    }
}
