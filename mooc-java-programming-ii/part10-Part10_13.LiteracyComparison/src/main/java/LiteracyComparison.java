
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<Literacy> rows = readFile("literacy.csv");

        rows.stream()     //.forEach(row -> System.out.println(row));
                .sorted((Literacy r1, Literacy r2) -> {
                    if (r1.getPercent() > r2.getPercent()) {
                        return 1;
                    }
                    else if (r1.getPercent() < r2.getPercent()) {
                        return -1;
                    }
                    else {
                        return 0;
                    }
                })
                .forEach(row -> System.out.println(row));
    }

    // From exercise 10_9
    public static List<Literacy> readFile(String file) {
        List<Literacy> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .map(line -> {
                        String sex = line[2].split(" ")[1];
                        String country = line[3];
                        int year = Integer.valueOf(line[4]);
                        double percent =  Double.valueOf(line[5]);
                        return new Literacy(sex, country, year, percent);
                    })
                    .forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        return rows;
    }
}
