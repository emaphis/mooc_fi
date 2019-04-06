
package inheritance;

import java.util.Scanner;


public class Addition extends Operation {

    public Addition() {
        super("Addition");
    }

    @Override
    public void execute(Scanner reader) {
        System.out.print("Give the first number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Give the second number: ");
        int second = Integer.parseInt(reader.nextLine());

        System.out.println("The sum is " + (first + second));
    }

}
