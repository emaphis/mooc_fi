
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String name = reader.nextLine();
        System.out.print("Length of the first part: ");
        int len = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + name.substring(0, len));
    }
}
