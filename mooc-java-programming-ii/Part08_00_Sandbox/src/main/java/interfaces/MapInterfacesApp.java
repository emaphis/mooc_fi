/*
 * Week 9 Example
 */
package interfaces;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author emaphis
 */
public class MapInterfacesApp {
    public static void main(String[] args) {
        example1();
        System.out.println("ooooooo");
    }

    private static void example1() {
        Map<String, String> kaannokset = new HashMap<>();
        kaannokset.put("ganbatte", "tsemppia");
        kaannokset.put("hai", "kylla");

        for (String avain : kaannokset.keySet()) {
            System.out.println(avain + ": " + kaannokset.get(avain));
        }
    }
}
