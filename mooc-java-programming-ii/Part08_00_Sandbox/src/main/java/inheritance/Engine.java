/*
 * Week 9 Example
 */
package inheritance;

/**
 *
 * @author emaphis
 */
public class Engine extends Part {
    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

}
