
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        System.out.println("*** Start timer ****");
        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error -- " + e.getMessage());
            }
        }

    }
}
