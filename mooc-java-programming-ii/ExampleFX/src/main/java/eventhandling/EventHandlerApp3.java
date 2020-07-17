
package eventhandling;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * Event Handler 2
 * @author emaphis
 */
public class EventHandlerApp3 extends Application {

    @Override
    public void start(Stage window) {
        var leftText = new TextField();
        var rightText = new TextField();

        leftText.textProperty().addListener((change, oldValue, newValue) -> {
            System.out.println(oldValue + " -> "  + newValue);
            rightText.setText(newValue);
        });

        var componentGroup = new HBox();
        componentGroup.setSpacing(10);
        componentGroup.getChildren().addAll(leftText, rightText);

        var viewport = new Scene(componentGroup);

        window.setTitle("Event Handler 3");
        window.setScene(viewport);
        window.show();
    }

    public static void main(String[] args) {
        launch(EventHandlerApp3.class, args);
    }
}
