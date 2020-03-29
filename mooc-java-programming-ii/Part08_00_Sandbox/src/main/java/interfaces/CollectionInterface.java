/*
 * Week 9 Example
 */
package interfaces;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author emaphis
 */
public class CollectionInterface {
    public static void main(String[] args) {
        Map<String, String> translations = new HashMap<>();
        translations.put("ganbatte", "good luck");
        translations.put("hai", "yes");

        Set<String> keys = translations.keySet();
        Collection<String> keyCollection = keys;

        System.out.println("Keys: ");
        for (String key : keyCollection) {
            System.out.println(key);
        }

        System.out.println();

        System.out.println("Values: ");
        Collection<String> values = translations.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
