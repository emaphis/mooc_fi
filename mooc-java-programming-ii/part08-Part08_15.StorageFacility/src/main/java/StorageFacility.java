
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (storage.containsKey(storageUnit)) {
            storage.get(storageUnit).remove(item);
            if (storage.get(storageUnit).isEmpty()) {
                storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();

        for (String storageUnit : storage.keySet()) {
            if (!storage.get(storageUnit).isEmpty()) {
                units.add(storageUnit);
            }
        }

        return units;
    }
}
