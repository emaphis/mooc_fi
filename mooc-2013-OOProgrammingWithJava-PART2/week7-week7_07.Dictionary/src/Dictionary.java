
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Dictionary {
    private final Map<String, String> words;

    public Dictionary() {
        this.words = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (words.containsKey(word))
            return words.get(word);

        return null;
    }

    public void add(String word, String translation) {
        words.put(word, translation);
    }

     public int amountOfWords() {
         return words.size();
     }

     public List<String> translationList() {
         List<String> list = new ArrayList<String>();
         for (String word : words.keySet()) {
             String str = word + " = " + words.get(word); 
             list.add(str);
         }
         return list;
     }
}
