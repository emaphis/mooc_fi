
import java.util.ArrayList;


public class NumberList implements Readable {
    private ArrayList<Readable> readables;

    public NumberList() {
        this.readables = new ArrayList<Readable>();
    }

    public void add(Readable readable) {
        readables.add(readable);
    }

    public int howManyReadables() {
        return readables.size();
    }

    @Override
    public String read() {
        String read = "";
        for (Readable readable : readables) {
            read += readable.read() + "\n";
        }

        readables.clear();
        return read;
    }
}
