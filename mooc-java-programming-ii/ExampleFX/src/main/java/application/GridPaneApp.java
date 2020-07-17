
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Grid Pane Layout Application
 * @author emaphis
 */
public class GridPaneApp extends Application {

    @Override
    public void start(Stage window) {
        var layout = new GridPane();

        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5; y++) {
                layout.add(new Button("" + x + ", " + y), x, y);
            }
        }

        var view = new Scene(layout);

        window.setTitle("Grid Plane Layout");
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(GridPaneApp.class);
    }
}
