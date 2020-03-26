/*
 * Week 8 example
 */
package hashmaps;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class PhoneNumberApp {
    public static void main(String[] args) {
        example1();
        System.out.println("ooooooo");
        example2();
    }

    // HashMap has at most one value per each key.
    static void example1() {
        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Pekka", "040-12348765");

        System.out.println("Pekka's number: " + phoneNumbers.get("Pekka"));

        phoneNumbers.put("Pekka", "09-111333");
        System.out.println("Pekka's number: " + phoneNumbers.get("Pekka"));
    }

    // List to store multiple values per key;
    static void example2() {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

        // initially attach an empty list
        phoneNumbers.put("Pekka", new ArrayList<>());

        // add phone numbers
        phoneNumbers.get("Pekka").add("040-12348765");
        phoneNumbers.get("Pekka").add("09-111333");

        System.out.println("Pekka's numbers: " + phoneNumbers.get("Pekka"));
    }
}
