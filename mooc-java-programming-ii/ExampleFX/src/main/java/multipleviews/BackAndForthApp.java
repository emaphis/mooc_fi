
package multipleviews;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Multiple views
 * @author emaphis
 */
public class BackAndForthApp extends Application {

    @Override
    public void start(Stage window) {

        var back  = new Button("Back .. ");
        var forth = new Button(".. forth");

        var first = new Scene(back);
        var second = new Scene(forth);

        back.setOnAction((event) ->{
            window.setScene(second);
        });

        forth.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setTitle("Back and Forth");
        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(BackAndForthApp.class);
    }
}
