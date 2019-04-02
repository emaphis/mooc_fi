
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    private final File file;
    private Scanner scanner;

    public Printer(String filename) {
        this.file = new File(filename);
    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            if (text.contains(word)) {
                System.out.println(text);
            }
        }
        scanner.close();
    }

}
