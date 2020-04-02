
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        System.out.print("Get file name: ");
        String file = scanner.nextLine();
        List<String> lines = read(file);
        lines.stream().forEach(line -> System.out.println(line));

    }

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<String>();

        try {
            rows = Files.lines(Paths.get(file)).collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        return rows;
    }
}
