
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


/**
 * Graphical user interface
 * @author emaphis
 */
public class JavaFXApplication extends Application {

    @Override
    public void start(Stage window) {
        var button = new Button("This is a button");

        var componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);

        var scene = new Scene(componentGroup);

        window.setTitle("Hello World!");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFXApplication.class, args);
    }

}
