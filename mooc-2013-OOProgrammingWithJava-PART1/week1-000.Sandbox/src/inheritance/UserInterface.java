
package inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserInterface {

    private Scanner reader;
    private List<Operation> operations;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.operations = new ArrayList<Operation>();
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public void start() {
        while (true) {
            printOperations();
            System.out.print("Choice: ");

            String choice = reader.nextLine();
            if (choice.equals("Q"))
                break;

            executeOperation(choice);
            System.out.println();
        }
    }

    private void printOperations() {
        System.out.println("Operations: ");
        System.out.println("  Q: Quit");
        for (int i = 0; i < operations.size(); i++) {
            String operationsName = operations.get(i).getName();
            System.out.println("  " + (i+1) + ": " + operationsName);
        }
    }

    private void executeOperation(String choice) {
        int operation = Integer.parseInt(choice);

        Operation chosen = operations.get(operation - 1);
        chosen.execute(reader);
    }

}
