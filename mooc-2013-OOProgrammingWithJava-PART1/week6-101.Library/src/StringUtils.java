
public class StringUtils {
    public static boolean included(String word, String searched) {
        String normWord = word.toLowerCase().trim();
        String normSearched = searched.toLowerCase().trim();
        return normWord.contains(normSearched);
    }
}
