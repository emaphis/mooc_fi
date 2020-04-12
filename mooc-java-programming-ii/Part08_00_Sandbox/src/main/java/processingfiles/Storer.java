/*
 * Week 11 Examples
 */
package processingfiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Processing files.
 * @author emaphis
 */
public class Storer {
    public void writeToFile(String fileName, String text) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        writer.print(text);
        writer.close();
    }

}
