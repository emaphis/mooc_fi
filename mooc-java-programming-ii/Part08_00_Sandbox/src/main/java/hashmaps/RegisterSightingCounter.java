/*
 * Week 8
 * Primitaves stored in HashMaps
 */
package hashmaps;

import java.util.HashMap;

/**
 *
 * @author emaphis
 */
public class RegisterSightingCounter {
    private HashMap<String, Integer> allSightings;

    public RegisterSightingCounter() {
        this.allSightings = new HashMap<>();
    }

    public void addSighting(String sighted) {
        int timesSighted = allSightings.getOrDefault(sighted, 0);
        timesSighted++;
        allSightings.put(sighted, timesSighted);
    }

    public int timesSighted(String sighted) {
        return allSightings.getOrDefault(sighted, 0);
    }
}
