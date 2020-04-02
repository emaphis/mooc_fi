/*
 * Week 10 Example
 */
package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class ReadPresidents {
    public static void main(String[] args) {
        List<Person> presidents = new ArrayList<>();

        try {
            Files.lines(Paths.get("presidents.txt"))
                    .map(row -> row.split(";"))
                    .filter(parts -> parts.length > 2)
                    .map(parts -> new Person(parts[0], parts[1], Integer.valueOf(parts[2])))
                    .forEach(person -> presidents.add(person));
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        System.out.println(presidents);
    }
}
