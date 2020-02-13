
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFile {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        try(Scanner scanner2 = new Scanner(Paths.get("file.txt"))) {
            while (scanner2.hasNext()) {
                String line = scanner2.nextLine();
                lines.add(line);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Total Lines: " + lines.size());
    }

}
