
import java.util.ArrayList;
import java.util.Scanner;


public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        //System.out.println("Hello, Sandbox!");

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);

        numbers.remove(Integer.valueOf(2));

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
