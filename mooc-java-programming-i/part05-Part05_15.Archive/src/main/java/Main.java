
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String itemID = scanner.nextLine();

            if (itemID.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String itemName = scanner.nextLine();

            if (itemName.isEmpty()) {
                break;
            }

            Item item = new Item(itemID, itemName);
            if (!items.contains(item)) {
                items.add(item);
            }
        }

        for (Item item : items) {
            System.out.println(item);
        }

    }
}
