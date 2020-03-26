
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author emaphis
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> register;

    public VehicleRegistry() {
        this.register = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!register.containsKey(owner)) {
            register.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return register.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!register.containsKey(licensePlate)) {
            return false;
        } else {
            register.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate plate : register.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : register.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }

        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
