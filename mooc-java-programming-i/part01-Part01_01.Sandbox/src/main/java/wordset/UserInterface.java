package wordset;


import java.util.Scanner;

/**
 * Week 6 example.
 * @author emaphis
 */
public class UserInterface {
    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }

    // loopig and quiting.
    // storing relevant information
    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (wordSet.contains(word)) {
                break;
            }

            // adding the word to the list of previus words.
            wordSet.add(word);

        }

        System.out.println("You gave the same word twice!");
        System.out.println(wordSet.palindromes() + " of words were palindromes");
    }

}
