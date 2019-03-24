
import java.util.List;
import java.util.Scanner;

public class Main {

    static void testDicionary() {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
    }

    static void testAmount() {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());

        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());
    }

    static void testAllWords() {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        List<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
    }

    static void runApp() {
        Scanner reader = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }

    public static void main(String[] args) {
        //testDicionary();
        //testAmount();
        //testAllWords();
        runApp();
    }
}
