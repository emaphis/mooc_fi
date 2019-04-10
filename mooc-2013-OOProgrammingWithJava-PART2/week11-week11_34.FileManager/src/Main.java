
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {

    static void testRead() throws FileNotFoundException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }


    public static void main(String[] args) throws IOException {
        try {
            testRead();
        } catch (FileNotFoundException ex) {
            System.err.println("File error: " + ex);
        }
    }
}
