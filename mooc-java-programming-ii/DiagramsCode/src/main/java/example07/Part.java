
package example07;


public class Part {
    private String ID;
    private String manufacturing;
    private String description;

    public Part(String ID, String manufacturing, String description) {
        this.ID = ID;
        this.manufacturing = manufacturing;
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public String getDescription() {
        return description;
    }

}
