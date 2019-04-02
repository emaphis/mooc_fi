
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Analysis {
    private final File file;
    private Scanner reader;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        int num = 0;
        reader = new Scanner(file);
        while (reader.hasNext()) {
            reader.nextLine();
            num++;
        }
        reader.close();
        return num;
    }

    public int characters() throws FileNotFoundException {
        int num = 0;
        reader = new Scanner(file);
        while (reader.hasNext()) {
            String text = reader.nextLine();
            num += text.length() + 1;
        }
        reader.close();
        return num;
    }

}
