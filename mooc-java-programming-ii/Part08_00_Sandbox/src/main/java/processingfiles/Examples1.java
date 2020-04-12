/*
 * Week 11 Examples
 */
package processingfiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author emaphis
 */
public class Examples1 {

    public static void main(String[] args) {
        try {
            //example1();
            example2();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    private static void example1() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("file.txt");
        writer.println("Hello file!"); //writes the string "Hello file!" and line change to the file
        writer.println("More text");
        writer.print("And a little extra"); // writes the string "And a little extra" to the file without a line change
        writer.close(); //closes the file and ensures that the written text is saved to the file
    }

    private static void example2() throws FileNotFoundException {
        Storer storer = new Storer();
         storer.writeToFile("diary.txt", "Dear diary, today was a good day.");
    }

}
