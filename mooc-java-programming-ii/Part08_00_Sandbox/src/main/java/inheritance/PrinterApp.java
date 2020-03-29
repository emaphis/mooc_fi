/*
 * Week 9 Example
 */
package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class PrinterApp {

    public static void main(String[] args) {
        example1();
        System.out.println("oooooooooo");
        example2();
    }

    private static void example1() {
        Printer printer = new Printer();

        String string = " o ";
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printer.printManyTime(string, 2);
        printer.printManyTime(words, 3);
    }

    private static void example2() {
        Printer printer = new Printer();
        String string = "works";
        printer.printCharacters(string);
    }

}
