
import java.util.Scanner;


public class Main {

    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u|å|ä|ö)*");
    }

    public static boolean clockTime(String string) {
        return string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        System.out.print("get string: ");
        String str = reader.nextLine();
        //System.out.println("test: " + isAWeekDay(str));
        //System.out.println("test: " + allVowels(str));
        System.out.println("test: " + clockTime(str));
    }
}
