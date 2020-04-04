
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String entry = scanner.nextLine();
        regexRunner(entry);
    }

    private static void regexRunner(String entry) {
        Checker checker = new Checker();

        //if (checker.isDayOfWeek(entry)) {
        //if (checker.allVowels(entry)) {
        if (checker.timeOfDay(entry)) {
            System.out.println("The form incorrect.");
        } else {
            System.out.println("Ther form is not correct.");
        }
    }
}
