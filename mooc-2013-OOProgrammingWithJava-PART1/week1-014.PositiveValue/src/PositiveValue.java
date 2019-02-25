
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        String answer = "";
        if (num <= 0) {
            answer = " not";
        }
        System.out.println("The number is" + answer + " positive.");
    }
}
