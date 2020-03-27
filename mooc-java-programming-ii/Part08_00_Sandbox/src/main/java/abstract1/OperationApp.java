/*
 * Week 9 Examples
 */
package abstract1;

import java.util.Scanner;

/**
 * Calculator app
 * @author emaphis
 */
public class OperationApp {
    public static void main(String[] args) {
        UserInterfaceOp userInterface = new UserInterfaceOp(new Scanner(System.in));
        userInterface.addOperation(new PlusOperation());

        userInterface.start();
    }
}
