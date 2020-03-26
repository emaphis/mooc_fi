
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        translations.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> list = translations.get(word);
        list.add(translation);
    }

    public ArrayList<String> translate(String word) {
        return translations.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        translations.remove(word);
    }
}
