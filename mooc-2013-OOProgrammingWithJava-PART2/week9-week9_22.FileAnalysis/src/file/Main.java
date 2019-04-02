package file;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    static void testAnalysis(File file) {
        try {
            Analysis analysis = new Analysis(file);
            System.out.println("Lines: " + analysis.lines());
            System.out.println("Characters: " + analysis.characters());
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/testfile.txt");
        testAnalysis(file);
    }
}
