
package inheritance;

import java.util.Scanner;


public class CalcApp {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        UserInterface ui = new UserInterface(reader);
        ui.addOperation(new Addition());

        ui.start();
    }

}
