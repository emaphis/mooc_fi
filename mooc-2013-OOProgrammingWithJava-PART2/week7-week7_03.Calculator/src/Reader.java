
import java.util.Scanner;

public class Reader {
    private final Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);
    }

    public String readString() {
        String newString = reader.nextLine();
        return newString;
    }

    public int readInteger() {
        int newInt = Integer.parseInt(reader.nextLine());
        return newInt;
    }
}
