
import java.util.Scanner;


public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        String entry;
        while (true) {
            System.out.print("Statement:");
            entry = reader.nextLine();

            if (entry.equals("quit")) {
                break;
            } else if (entry.equals("add")) {
                add();
            } else if (entry.equals("translate")) {
                translate();
            }
            else
                System.out.println("Unknown statement");
        }
        
        System.out.println("Cheers!");
    }

    private void add() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(word, translation);
        System.out.println();
    }

    private void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();

        String translation = dictionary.translate(word);
        if (translation == null) {
            System.out.println("Unknown word.");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
