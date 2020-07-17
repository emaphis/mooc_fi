
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Layout controls.
 * @author emaphis
 */
public class MultipleLayoutApp extends Application {

    @Override
    public void start(Stage window) {
        var layout = new BorderPane();

        var buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Button("First"));
        buttons.getChildren().add(new Button("Second"));
        buttons.getChildren().add(new Button("Third"));

        var texts = new VBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("First"));
        texts.getChildren().add(new Label("Second"));
        texts.getChildren().add(new Label("Third"));

        layout.setTop(buttons);
        layout.setLeft(texts);

        layout.setCenter(new TextArea(""));

        var view = new Scene(layout);

        window.setTitle("Multiple Layouts");
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleLayoutApp.class, args);
    }

}
