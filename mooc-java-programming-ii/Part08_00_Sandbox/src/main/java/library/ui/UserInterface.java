/*
 * Week 11 Example
 */
package library.ui;

import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        printTitle();

        // more functionality
    }

    private void printTitle() {
        System.out.println("=============");
        System.out.println("** Library **");
        System.out.println("==============");
    }

}
