
package regex;

import java.util.Scanner;


// num.matches("01[0-9]{7}"))
// Vertical Bar: Logical or
// .. string.matches("00|111|0000")

// Round Brackets: a Delimited Part of the String
// .. word.matches("look(|s|ed|ing|er)")

//  Repetitions:
// - The symbol * stands for a repetition from 0 to n times, for instance
// .. string.matches("trolo(lo)*")
// - The symbol + stands for a repetition from 1 to n times, for instance
// .. characterString.matches("tro(lo)+")
// .. characterString.matches("(nä)+ Bätmään!")
// - The symbol ? stands for a repetition of 0 or 1 time, for instance
// .. characterString.matches("You have accidentally (deleted )?the whole name")
// - The symbol {a} stands for a repetition of a times, for instance
// .. string.matches("(10){2}")
// - The symbol {a,b} stands for a repetition from a to b times, for instance
// .. string.matches("(10){2}")
// - he symbol {a,b} stands for a repetition from a to b times, for instance
// .. string.matches("1{2,4}")
// - The symbol {a,} stands for a repetition from a to n times, for instance
// .. string.matches("1{2,}")

// Square Brackets: Character Groups


public class RegexApp {

    static void testStudentRegex(Scanner reader) {
        System.out.print("Give student number: ");
        String num = reader.nextLine();

        if (num.matches("01[0-9]{7}")) {
            System.out.println("The form is valid");
        } else {
            System.out.println("The form is not valid");
        }

    }

    static void testLogicalOr() {
        String string = "000";

        if(string.matches("00|111|0000")) {
            System.out.println("The string was matched by some of the alternatives");
        } else {
            System.out.println("The string not was matched by any of the alternatives");
        }
    }

    static void testRoundBracket(Scanner reader) {
        System.out.print("Write a form of the verb to look: ");
        String word = reader.nextLine();

        if (word.matches("look(|s|ed|ing|er)")) {
            System.out.println("Well done!");
        } else {
            System.out.println("Check again the form.");
        }
    }

    static void testRepetitions() {
        String string = "trololololololo";

        if(string.matches("trolo(lo)*")) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //testStudentRegex(reader);
        //testLogicalOr();
        //testRoundBracket(reader);
        testRepetitions();
    }

}
