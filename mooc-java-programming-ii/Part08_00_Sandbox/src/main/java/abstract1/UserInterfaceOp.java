/*
 * Week 9 Examples
 */
package abstract1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * User interface for calculator
 * @author emaphis
 */
public class UserInterfaceOp {
    private Scanner scanner;
    private ArrayList<Operation> operations;

    public UserInterfaceOp(Scanner scanner) {
        this.scanner = scanner;
        this.operations = new ArrayList<>();
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public void start() {
        while (true) {
            printOperations();
            System.out.print("Choice: ");

            String choice = scanner.nextLine();
            if (choice.equals("0")) {
                break;
            }

            executeOperation(choice);
            System.out.println();
        }
    }

    private void printOperations() {
        System.out.println("\t0: Stop");
        int i = 0;
        while (i < operations.size()) {
            String operationName = operations.get(i).getName();
            System.out.println("\t" + (i + 1) + ": " + operationName);
            i++;
        }
    }

    private void executeOperation(String choice) {
        int operation = Integer.valueOf(choice);

        Operation chosen = operations.get(operation - 1);
        chosen.execute(scanner);
    }
}
