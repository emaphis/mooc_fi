
package files;

import java.io.FileWriter;
import java.io.IOException;


public class FileHandler {

    public void writeToFile(String fileName, String text) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(text);
        writer.close();
    }

    public void appendToFile(String fileName, String text) throws IOException {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(text);
        writer.close();
    }

}
