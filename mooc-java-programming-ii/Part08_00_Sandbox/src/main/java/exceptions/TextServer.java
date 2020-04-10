/*
 * Week 11 Examples
 */
package exceptions;

import java.util.HashMap;
import java.util.Map;

/**
 * Exceptions and Interfaces
 * @author emaphis
 */
public class TextServer implements FileServer {
    private Map<String, String> data;

    public TextServer() {
        this.data = new HashMap<>();
    }

    @Override
    public String load(String fileName) throws Exception {
        return data.get(fileName);
    };

    @Override
    public void save(String filename, String textToSave) throws Exception {
        data.put(filename, textToSave);
    }

}
