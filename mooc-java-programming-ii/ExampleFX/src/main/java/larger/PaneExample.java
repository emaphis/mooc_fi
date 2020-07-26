
package larger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 *
 * @author emaphis
 */
public class PaneExample extends Application {

    @Override
    public void start(Stage stage) {
        Pane layout = new Pane();
        layout.setPrefSize(300, 200);
        layout.getChildren().add(new Circle(30, 50, 10));

        stage.setTitle("Pane Example");
        stage.setScene(new Scene(layout));
        stage.show();
    }

    public static void main(String[] args) {
        launch(PaneExample.class);
    }

}
