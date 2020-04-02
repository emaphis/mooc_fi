
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            list.add(input);
        }

        double average = list.stream()
                .mapToInt(str -> Integer.valueOf(str))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
