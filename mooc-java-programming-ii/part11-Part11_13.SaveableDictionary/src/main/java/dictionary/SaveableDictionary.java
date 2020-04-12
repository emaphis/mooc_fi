
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author emaphis
 */
public class SaveableDictionary {
    private Map<String,String> words;
    private String fileName;

    public SaveableDictionary() {
        this.words = new HashMap<>();
        this.fileName = null;
    }

    public SaveableDictionary(String file) {
        this();
        this.fileName = file;
    }

    public boolean load() {
        try {
            try (Scanner scanner = new Scanner(new File(fileName))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(":");
                    this.add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (IOException ex) {
            System.err.println("File error: " + ex.getMessage());
            return false;
        }
    }

    public boolean save() {
        ArrayList<String> allreadyWritten = new ArrayList<>();

        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (String word : words.keySet()) {
                String translation = words.get(word);
                if (!allreadyWritten.contains(word) && !allreadyWritten.contains(translation)) {
                    allreadyWritten.add(word);
                    writer.println(word + ":" + translation);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File error: " + ex.getMessage());
            return false;
        }
        return true;
    }

    public void add(String word, String translation) {
        words.putIfAbsent(word, translation);
        words.putIfAbsent(translation, word);
    }

    public String translate(String word) {
        String translastion = words.getOrDefault(word, null);
        return translastion;
    }

    public void delete(String word) {
        String translation = translate(word);

        if (translation != null) {
            words.remove(word);
            words.remove(translation);
        }
    }
}
