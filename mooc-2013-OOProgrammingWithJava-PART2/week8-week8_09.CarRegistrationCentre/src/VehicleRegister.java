
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;


public class VehicleRegister {
    private Map<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate))
            return false;

        owners.put(plate, owner);

        return true;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }

        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }

        return false;
    }


    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        List<String> ownerList = new ArrayList<String>();

        for (RegistrationPlate plate : owners.keySet()) {
            String name = owners.get(plate);
            if (!ownerList.contains(name))
                ownerList.add(name);
        }

        for (String name : ownerList) {
            System.out.println(name);
        }
    }
}
