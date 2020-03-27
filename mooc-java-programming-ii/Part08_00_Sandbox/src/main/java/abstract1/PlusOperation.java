/*
 * Week 9 Examples
 */
package abstract1;

import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class PlusOperation extends Operation {

    public PlusOperation() {
        super("PlusOeration");
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.print("First number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second));
    }

}
