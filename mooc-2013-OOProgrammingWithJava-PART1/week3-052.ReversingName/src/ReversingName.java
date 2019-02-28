import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");

        int length = name.length();

        int i = 1;
        while (i < length+1) {
            System.out.print(name.charAt(length - i));
            i++;
        }
        System.out.println("");
    }
}
