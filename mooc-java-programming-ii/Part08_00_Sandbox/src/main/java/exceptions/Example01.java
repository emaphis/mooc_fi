/*
 * Week 11 Example
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class Example01 {
    public static void main(String[] args) {
        example2();
    }

    private static void example1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int readNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(readNumber);
    }

    private static void example2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int readNumber = -1;

        try {
            readNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Good job!");
        } catch (Exception e) {
            System.err.println("User input was not a number.");
        }
    }
}
