
package eventhandling;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

/**
 * Demonstrates passing parameters
 * @author emaphis
 */
public class ParameterApp extends Application {

    @Override
    public void start(Stage window) {
        var params =  getParameters();
        var organization = params.getNamed().get("organization");
        var course = params.getNamed().get("course");

        window.setTitle(organization + ": " + course);
        window.show();
    }
}
