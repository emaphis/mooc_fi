package wordset;


// replace ArrayList with HashSet.
import java.util.ArrayList;

/**
 * Week 6 example
 * @author emaphis
 */
public class WordSet {
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public boolean contains(String word) {
        return words.contains(word);
    }

    public void add(String word) {
        words.add(word);
    }

    public int palindromes() {
        int count = 0;

        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        return count;
    }

    public boolean isPalindrome(String word) {
        int end = word.length() - 1;

        int i = 0;
        while (i < word.length() / 2) {
            // method charAt returns the character at given index
            // as a simple variable
            if(word.charAt(i) != word.charAt(end - i)) {
                return false;
            }

            i++;
        }

        return true;
    }
}
