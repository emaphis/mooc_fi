
package files;

import java.io.FileWriter;
import java.io.IOException;


public class FileApp {

    static void testFile() throws IOException {
        FileWriter writer = new FileWriter("file.txt");
        writer.write("Hi file!\n"); // the line break has to be written, too! writer.write("Adding text\n");
        writer.write("And more");
        writer.close(); // the call closes the file and makes sure the written text goes to the fi

    }

    static void testFileHandler() throws IOException {
        FileHandler handler = new FileHandler();
        handler.writeToFile("diary.txt", "Dear Diary, today was a nice day.");
    }

    static void testAppendToFile() throws IOException {
        FileHandler handler = new FileHandler();
        handler.writeToFile("diary.txt", "Dear Diary, today was a nice day.\n");
        handler.appendToFile("diary.txt", "Dear Diary, next day was really fun.\n");
    }

    public static void main(String[] args) {
        try {
            //testFile();
            //testFileHandler();
            testAppendToFile();
        } catch (IOException ex) {
            System.err.println("File error: " + ex);
        }
    }

}
