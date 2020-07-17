
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * UI components and layout.
 * @author emaphis
 */
public class BorderPaneApp extends Application {

    @Override
    public void start(Stage window) {
        var layout = new BorderPane();
        layout.setTop(new Label("top"));
        layout.setRight(new Label("right"));
        layout.setBottom(new Label("bottom"));
        layout.setLeft(new Label("left"));
        layout.setCenter(new Label("center"));

        var view = new Scene(layout);

        window.setTitle("Border Pane App");
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApp.class);
    }

}
