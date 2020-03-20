
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container("first", 100);
        Container second = new Container("second", 100);

        while (true) {
            System.out.println();
            System.out.println(first);
            System.out.println(second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String items[] = input.split(" ");
            String command = items[0];
            int amount = Integer.valueOf(items[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                int newAmount = first.remove(amount);
                second.add(newAmount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
