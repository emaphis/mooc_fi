
package eventhandling;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Button event handling
 * @author emaphis
 */
public class EventHandlerApp1 extends Application {

    @Override
    public void start(Stage window) {
       var button = new Button("This is a button");

       button.setOnAction((event) -> {
           System.out.println("Pressed!");
       });

       var view = new Scene(button);

       window.setTitle("Button Event app");
       window.setScene(view);
       window.show();
    }

    public static void main(String[] args) {
        launch(EventHandlerApp1.class);
    }

}
