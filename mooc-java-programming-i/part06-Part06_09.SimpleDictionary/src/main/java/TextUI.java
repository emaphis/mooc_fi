
import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class TextUI {

    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            executeCommand(command);
            System.out.println();
        }
        //System.out.println(dictionary); // *** temp
    }

    void executeCommand(String command) {

        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            unknown();
        }
    }

    void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        dictionary.add(word, translation);
    }

    void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
        String translation = dictionary.translate(word);
        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Word " + word + " was not found");
        }
    }

    void unknown() {
        System.out.println("Unknown command");
    }
}
