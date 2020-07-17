
package eventhandling;

import application.JavaFXApplication;
import javafx.application.Application;

/**
 * Demonstrates parameter passing
 * @author emaphis
 */
public class Main {

    public static void main(String[] args) {
        Application.launch(ParameterApp.class,
                "--organization=Once upon a time",
                "--course=Title");
    }
}
