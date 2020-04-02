
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int num = 0;

        while (true) {
            num = Integer.valueOf(scanner.nextLine());

            if (num < 0) {
                break;
            }

            numbers.add(num);
        }

        numbers.stream()
                .filter(value -> value >= 1 && value <= 5)
                .forEach(value -> System.out.println(value));
    }
}
