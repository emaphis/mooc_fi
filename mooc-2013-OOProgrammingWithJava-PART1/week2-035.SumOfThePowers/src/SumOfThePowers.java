
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int end = Integer.parseInt(reader.nextLine());
        int sum = 0;

        int num = 0;
        while (num <= end) {
            sum += (int)Math.pow(2, num);
            num++;
        }

        System.out.println("The result is " + sum);
    }
}
