import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int end = Integer.parseInt(reader.nextLine());
        int num = 1;  // base
        int prod = 1;

        while (num <= end) {
            prod *= num;
            num++;
        }

        System.out.println("Factorial is " + prod);
    }
}
