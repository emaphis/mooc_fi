
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * UI components and layout.
 * @author emaphis
 */
public class HBoxApplication extends Application {

    @Override
    public void start(Stage window) {

        var layout = new HBox();
        layout.setSpacing(10);

        layout.getChildren().add(new Label("first"));
        layout.getChildren().add(new Label("second"));
        layout.getChildren().add(new Label("third"));

        var view = new Scene(layout);

        window.setTitle("HBox App");
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(HBoxApplication.class);
    }

}
