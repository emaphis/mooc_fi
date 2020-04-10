/*
 * Week 11 Examples
 */
package exceptions;

/**
 * Exceptions and Interfaces.
 * @author emaphis
 */
public interface FileServer {
    String load(String fileName) throws Exception;
    void save(String filename, String textToSave) throws Exception;
}
