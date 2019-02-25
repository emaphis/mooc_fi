
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String check = "S";
        String secret = "Carrots are good for the eyes!";
 
        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            check = reader.nextLine();

            if (!check.equals(password)) {
                System.out.println("Wrong!");
            } else {
                System.out.println("Right!");
                System.out.println("");
                System.out.print("The secret is: ");
                System.out.println(secret);
                break;
            }
        }
    }
}
