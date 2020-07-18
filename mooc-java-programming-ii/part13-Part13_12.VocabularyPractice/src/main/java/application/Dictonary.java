
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


/**
 *
 * @author emaphis
 */
public class Dictonary {

    private List<String> words;
    private Map<String, String> translations;

    public Dictonary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();

        add("sana", "word");
    }

    public String get(String word) {
        return translations.get(word);
    }

    public void add(String word, String translation) {
        if (!translations.containsKey(word)) {
            words.add(word);
        }

        translations.put(word, translation);
    }

    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
