
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

            if (command.equals("add")) {
                System.out.print("To add: ");
                String item = scanner.nextLine();
                list.add(item);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is remove? ");
                int number = Integer.valueOf(scanner.nextLine());
                list.remove(number);
            }
        }
    }

}
