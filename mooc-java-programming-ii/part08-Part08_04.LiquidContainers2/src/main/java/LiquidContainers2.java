
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] items = input.split(" ");
            String command = items[0];
            int amount = Integer.valueOf(items[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                if (first.contains() - amount >= 0) {
                    second.add(amount);
                } else {
                    second.add(first.contains());
                }
                first.remove(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }

    }
}
