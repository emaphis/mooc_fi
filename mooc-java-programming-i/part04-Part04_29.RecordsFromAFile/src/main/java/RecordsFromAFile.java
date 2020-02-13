
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of file: ");
        String file = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {

            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                String label = "";
                if (age == 1)
                    label = " year";
                else
                    label = " years";

                System.out.println(name + ", age: " + age + label);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
