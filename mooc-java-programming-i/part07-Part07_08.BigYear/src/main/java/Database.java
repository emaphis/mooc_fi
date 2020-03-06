
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author emaphis
 */
public class Database {
    private ArrayList<Bird> birds;
    private HashMap<String, Integer> observations;

    public Database() {
        this.birds = new ArrayList();
        this.observations = new HashMap<>();
    }

    public void addBird(String name, String latin) {
        birds.add(new Bird(name, latin));
        observations.put(name, 0);
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }

    public boolean containsBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void observeBird(String name) {
        if (containsBird(name)) {
            int obs = observations.get(name);
            obs++;
            observations.put(name, obs);
        }
    }

    public Bird getBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public int getObservation(String name) {
        if (containsBird(name)) {
            return observations.get(name);
        }
        return 0;
    }
}
