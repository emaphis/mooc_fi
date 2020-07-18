
package multipleviews;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Views with the same main alignment
 * @author emaphis
 */
public class ExampleApp extends Application {

    @Override
    public void start(Stage window) {

        // 1. Create main layout
        var layout = new BorderPane();

        // 1.1. Create mue for main layout
        var menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        // 1.2.  Create buttons for menu
        var first = new Button("First");
        var second = new Button("Second");

        // 1.3 Add buttons to menu
        menu.getChildren().addAll(first, second);

        layout.setTop(menu);

        // 2. Add subview and add them to the menu buttons
        // 2.1. Create subview layout
        var firstLayout = createView("First view");
        var secondLayout = createView("Second view");

        // 2.2. Add subview to button. pressing buttons will change the view
        first.setOnAction((event) -> layout.setCenter(firstLayout));
        second.setOnAction((event) -> layout.setCenter(secondLayout));

        // 2.3. Set inital view.
        layout.setCenter(firstLayout);

        // 3. Create main scene with layout
        var scene = new Scene(layout);

        // 4. Show main scene
        window.setTitle("Layout test");
        window.setScene(scene);
        window.show();
    }

    private StackPane createView(String text) {

        var layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(ExampleApp.class);
    }
}
