
import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class UserInterface {
    private Scanner scanner;
    private Database db;

    public UserInterface(Scanner scanner, Database db) {
        this.scanner = scanner;
        this.db = db;
    }

    public void run() {

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();
                db.addBird(name, latin);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                if (db.containsBird(name)) {
                    db.observeBird(name);
                } else {
                    System.out.println("Not  bird!");
                }
            }

            if (command.equals("All")) {
                System.out.print("");
                for (Bird bird : db.getBirds()) {
                    System.out.println(bird.getName() + " (" + bird.getLatin() + "): " +
                            db.getObservation(bird.getName()) + " observations");
                }
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                if (db.containsBird(name)) {
                    Bird bird = db.getBird(name);
                    System.out.println(bird.getName() + " (" + bird.getLatin() + "): " +
                            db.getObservation(name) + " observations");
                } else {
                    System.out.println("Not a bird!");
                }
            }
        }

    }
}
