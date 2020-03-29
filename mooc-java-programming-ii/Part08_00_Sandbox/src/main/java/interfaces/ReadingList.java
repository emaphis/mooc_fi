
package interfaces;

import java.util.ArrayList;

/**
 * Interfaces as method parameters
 * @author emaphis
 */
public class ReadingList implements Readable {
    private ArrayList<Readable> readables;

    public ReadingList() {
        this.readables = new ArrayList<>();
    }

    public void add(Readable readable) {
        readables.add(readable);
    }

    public int toRead() {
        return readables.size();
    }

    // ReadingLists are Readable soo...
    @Override
    public String read() {
        String read = "";

        for (Readable readable : readables) {
            read = read +  readable.read() + "\n";
        }

        // once the reading list has been read, we empty it
        readables.clear();
        return read;
    }
}
