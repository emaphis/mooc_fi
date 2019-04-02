
package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Phonebook {
    //private List<String> persons;
    private Map<String, Set<String>> phoneNumbers;
    private Map<String, String> numberToName;
    private Map<String, Address> addresses;

    public Phonebook() {
        this.phoneNumbers = new HashMap<String, Set<String>>();
        this.addresses = new HashMap<String, Address>();
        this.numberToName = new HashMap<String, String>();
    }


    public void addNumber(String name, String number) {
        if (phoneNumbers.containsKey(name))
            phoneNumbers.get(name).add(number);
        else {
            Set<String> set = new HashSet<String>();
            set.add(number);
            phoneNumbers.put(name, set);
        }
        numberToName.put(number, name);
    }

    public Set<String> getNumbers(String name) {
        if (!phoneNumbers.containsKey(name))
            return null;
        else
            return phoneNumbers.get(name);
    }

    public String searchPesonNumber(String number) {
        if (!numberToName.containsKey(number))
            return null;
        else
            return numberToName.get(number);
    }

    public void addAddress(String name, String street, String city) {
        Address address = new Address(street, city);
        addresses.put(name, address);
    }

    public Address getAddress(String name) {
        if (!addresses.containsKey(name))
            return null;
        return addresses.get(name);
    }

    void deletePerson(String name) {
        // all numbers must be removed each
        if (phoneNumbers.containsKey(name)) {
            for (String number : phoneNumbers.get(name)) {
                phoneNumbers.remove(number);
                numberToName.remove(number);
            }
            phoneNumbers.remove(name);
        }

        addresses.remove(name);
    }

    Set<String> findFiltered(String keyword) {
        Set<String> names = new HashSet<String>();
        for (String name : addresses.keySet()) {
            if (name.contains(keyword)) {
                names.add(name);
            } else {
                Address address = addresses.get(name);
                if (address.searchString(keyword))
                    names.add(name);
            }
        }
        for (String name : numberToName.keySet()) {
            if (name.contains(keyword))
                names.add(name);
        }

        return names;
    }

}
