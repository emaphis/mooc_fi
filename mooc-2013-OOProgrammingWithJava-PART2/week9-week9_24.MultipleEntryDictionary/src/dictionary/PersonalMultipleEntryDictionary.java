
package dictionary;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;


public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private final Map<String, HashSet<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, HashSet<String>>();
    }


    @Override
    public void add(String word, String entry) {
        if (dictionary.containsKey(word)) {
            dictionary.get(word).add(entry);
        } else {
            HashSet<String> set = new HashSet<String>();
            set.add(entry);
            dictionary.put(word, set);
        }
    }

    @Override
    public Set<String> translate(String word) {
        if (!dictionary.containsKey(word)) {
            return null;
        }
        return dictionary.get(word);
    }

    @Override
    public void remove(String word) {
        dictionary.remove(word);
    }

}
