
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int count = Integer.valueOf(scanner.nextLine());
        if (count <= num) {
            while (count <= num) {
                System.out.println(count);
                count = count + 1;
            }
        }
    }
}
