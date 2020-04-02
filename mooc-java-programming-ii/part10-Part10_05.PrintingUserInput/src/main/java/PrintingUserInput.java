
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        String input = "";

        while (true) {
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            list.add(input);
        }

        list.stream().forEach(value -> System.out.println(value));
    }
}
