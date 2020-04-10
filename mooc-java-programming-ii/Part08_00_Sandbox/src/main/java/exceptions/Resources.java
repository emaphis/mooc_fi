/*
 * Week 11 Examples
 */
package exceptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exceptions and resources
 * @author emaphis
 */
public class Resources {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        List<String> lines = new ArrayList<>();

        // create a scanner ojbect for reading files
        try (Scanner reader = new Scanner(new File("file.txt"))) {
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
