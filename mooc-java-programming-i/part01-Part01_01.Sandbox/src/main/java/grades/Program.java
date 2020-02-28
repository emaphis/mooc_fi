
package grades;

import java.util.Scanner;

/**
 * Week 6 example.
 * @author emaphis
 */
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        UserInterface userInterface = new UserInterface(register, scanner);
        userInterface.start();
    }
}
