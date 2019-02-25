
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        String answer1 = "";
        String answer2 = ""; 
        if (age < 18) {
            answer1 = " not";
            answer2 = " yet";
        }
        System.out.println("You have" + answer1 + " reached the age of majority"
                  + answer2 + "!");
    }
}
