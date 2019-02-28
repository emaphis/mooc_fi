
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String word1 = reader.nextLine();
        System.out.print("Type the second wword: ");
        String word2 = reader.nextLine();

        int found = word1.indexOf(word2);
        //System.out.println("found: " + found);
        if (found != -1) {
            System.out.println("The world '" + word2 + "' is found in the word '"
                                + word1 + "'");
        } else {
            System.out.println("The world '" + word2 + "' is not found in the word '"
                                + word1 + "'");
        }
    }
}
