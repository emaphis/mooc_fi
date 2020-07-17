
package eventhandling;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * Event Handler 2
 * @author emaphis
 */
public class EventHandlerApp2 extends Application {

    @Override
    public void start(Stage window) {
        var leftText = new TextField();
        var rightText = new TextField();
        var button = new Button("Copy");

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });
/*
        leftText.textProperty().addListener((ObservableValue<? extends String> change, String oldValue, String newValue) -> {
            System.out.println(oldValue + " -> "  + newValue);
            rightText.setText(newValue);
        });
*/
        var componentGroup = new HBox();
        componentGroup.setSpacing(10);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        var viewport = new Scene(componentGroup);

        window.setTitle("Event Handler 2");
        window.setScene(viewport);
        window.show();
    }

    public static void main(String[] args) {
        launch(EventHandlerApp2.class, args);
    }
}
