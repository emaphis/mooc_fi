
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String output = "";
        if (elements.isEmpty()) {
            output += "The collection " + name + " is empty.";
        } else if (elements.size() == 1) {
            output += "The collection " + name + " has " + elements.size() + " element:\n" +
                    elements.get(0);
        } else {
            output += "The collection " + name + " has " + elements.size() + " elements:";
            for (String element : elements) {
                output += "\n" + element;
            }
        }
        return output;
    }
}