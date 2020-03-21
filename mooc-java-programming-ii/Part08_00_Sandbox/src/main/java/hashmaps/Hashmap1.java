package hashmaps;

import java.util.HashMap;

/**
 *
 * @author emaphis
 */
public class Hashmap1 {

    public static void main(String[] args) {
        example1();
        System.out.println();
        example2();
        System.out.println();
        example3();
    }

    static void example1() {
        HashMap<String, String> postalCodes = new HashMap<>();
        postalCodes.put("00710", "Helsinki");
        postalCodes.put("90014", "Oulu");
        postalCodes.put("33720", "Tampere");
        postalCodes.put("33014", "Tampere");
        System.out.println(postalCodes.get("00710"));
    }

    static void example2() {
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("One", "Uno");
        numbers.put("Two", "Dos");

        String kaannos = numbers.get("One");
        System.out.println(kaannos);

        System.out.println(numbers.get("Two"));
        System.out.println(numbers.get("Three"));
        System.out.println(numbers.get("Uno"));
    }

    // HashMpa keys correspond to sigle values
    static void example3() {
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("Uno", "One");
        numbers.put("Dos", "Zwei");
        numbers.put("Uno", "Ein");

        String translation = numbers.get("Uno");
        System.out.println(translation);

        System.out.println(numbers.get("Dos"));
        System.out.println(numbers.get("Tres"));
        System.out.println(numbers.get("Uno"));
    }
}
