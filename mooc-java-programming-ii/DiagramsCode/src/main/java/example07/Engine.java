
package example07;


public class Engine extends Part {
    private String type;

    public Engine(String type, String ID, String manufacturing, String description) {
        super(ID, manufacturing, description);
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
