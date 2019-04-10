
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class MindfulDictionary {
    private Map<String, String> dictionary;
    private String filepath;

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String filepath) {
        this();
        this.filepath = filepath;
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
            dictionary.put(translation, word);
        }
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void remove(String word) {
        String translation = translate(word);
        dictionary.remove(word);
        dictionary.remove(translation);
    }

    public boolean load() {
        try {
            File file = new File(filepath);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                add(parts[0],  parts[1]);
            }

            reader.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
            return false;
        }
    }

     public boolean save() {
        try {
            File file = new File(filepath);
            FileWriter writer = new FileWriter(file);
            List<String> noDups = new ArrayList<String>();

            for (String word : dictionary.keySet()) {
                String translation = dictionary.get(word);
                if (!noDups.contains(word)) {
                    String entry = word + ":" + translation + "\n";
                    writer.write(entry);
                    noDups.add(translation);
                }
            }

            writer.close();
            return true;
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
            return false;
        }
    }
}
