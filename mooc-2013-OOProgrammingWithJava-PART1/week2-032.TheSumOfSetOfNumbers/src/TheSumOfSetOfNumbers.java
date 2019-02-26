
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int end = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int num = 1;
        while (num <= end) {
            sum += num;
            num++;
        }
        System.out.println("Sum is " + sum);
    }
}
