
import java.awt.AWTEventMulticaster;
import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            processCommand(command);
            System.out.println();
        }
    }

    void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        } else {
            unknown();
        }
    }

    private void unknown() {
        System.out.println("Unknown command");
    }

    private void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        list.add(task);
    }

    private void list() {
        list.print();
    }

    private void remove() {
        System.out.print("Which task is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        list.remove(number);
    }

}
