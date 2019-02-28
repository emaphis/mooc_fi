import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        if (name.length() < 3)
            return;

        int i = 0;
        while (i < 3) {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
            i++;
        }
    }
}
