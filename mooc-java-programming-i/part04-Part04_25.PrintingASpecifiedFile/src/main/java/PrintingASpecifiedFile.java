
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed? ");
        String file = scanner.nextLine();

        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
