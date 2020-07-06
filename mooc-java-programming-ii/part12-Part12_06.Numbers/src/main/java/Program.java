
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many numbers sould be printed");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println(random.nextInt(11));
        }
    }

}
