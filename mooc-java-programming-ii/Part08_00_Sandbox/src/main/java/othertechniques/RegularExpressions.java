/*
 * Week 10 Example
 * Regular Expressions
 */
package othertechniques;

import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class RegularExpressions {

    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
       // expression1();
       // alternation();
       // partsOfString();
       // quantifies1();
       //quantifies2();
       quizz();
        System.out.println();
    }

    // 019999999
    private static void expression1() {
        System.out.print("Provide a student number: ");
        String number = scanner.nextLine();

        if (number.matches("01[0-9]{7}")) {
            System.out.println("Correct formant");
        } else {
            System.out.println("Incorrect format");
        }
    }

    // Alternation (Vertical Line) [or]
    private static void alternation() {
        System.out.print("00 or 111 or 0000: ");
        String number = scanner.nextLine();
        if (number.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }
    }

    // Affecting part of a string (Parentheses)
    private static void partsOfString() {
        System.out.print("00000 or 00001: ");
        String number = scanner.nextLine();
        if (number.matches("0000(0|1)")) {
            System.out.println("The string contained one of the two alternatives");
        } else {
            System.out.println("The string contained none of two alternatives");
        }

    }

    // Quantifier repeats sever times.(*)
    private static void quantifies1() {
        System.out.print("examples repeating: trolo(lo) zero or more times: ");
        String number = scanner.nextLine();
        if (number.matches("trolo(lo)*")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }
    }

    private static void quantifies2() {
        System.out.print("examples repeating one or more times: trolo ... : ");
        String number = scanner.nextLine();
        if (number.matches("trolo(lo)*")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }
    }

    private static void quizz() {
        String regex = "ab(ba)+";

        String word = "abba";

        if (word.matches(regex)) {
            System.out.println("**** Correct");
        } else {
            System.out.println("---- Fail");
        }
    }

}
