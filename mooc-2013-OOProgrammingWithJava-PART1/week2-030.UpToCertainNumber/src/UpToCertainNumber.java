
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());
        int num = 1;
        while (num <= limit) {
            System.out.println(num);
            num++;
        }
    }
}
