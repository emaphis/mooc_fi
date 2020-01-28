
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int amount = Integer.valueOf(scan.nextLine());

        if (amount <= 5000) {
            System.out.println("No tax!");
        } else if (amount <= 25000) {
            System.out.println("Tax: " + (100 + (amount - 5000) * 0.08));
        } else if (amount < 55000) {
            System.out.println("Tax: " + (1700 + (amount - 25000) * 0.10));
        }       
    }
        
    }
}
