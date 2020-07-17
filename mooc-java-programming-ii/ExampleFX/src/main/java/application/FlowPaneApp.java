
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * UI components and their layout
 * @author emaphis
 */
public class FlowPaneApp extends Application {

    @Override
    public void start(Stage window) {
        var buttonComponent = new Button("This is a button");
        var textComponent = new Label("Text element");

        var componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(textComponent);

        var view = new Scene(componentGroup);

        window.setTitle("Flow Plane Layout Application");
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(FlowPaneApp.class, args);
    }

}
