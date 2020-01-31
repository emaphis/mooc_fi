
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        int count = 1;
        int multiplicant = 1;
        while (count <= number) {
            multiplicant *= count;
            count++;
        }
        System.out.println("Factorial: " + multiplicant);
    }
}
