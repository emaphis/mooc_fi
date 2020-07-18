
package multipleviews;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author emaphis
 */
public class PracticeApp extends Application {

    private Dictonary dictonary;

    @Override
    public void init() throws Exception {
        this.dictonary = new Dictonary();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Create the subviews
        PracticeView practiceView = new PracticeView(dictonary);
        InputView inputView = new InputView(dictonary);

        // Higher level layout
        BorderPane layout = new BorderPane();

        // Create the menu for the general layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        // Create the menu buttons
        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        // Add buttons to the menu
        menu.getChildren().addAll(enterButton, practiceButton);
        layout.setTop(menu);

        // Connect the subview with buttons
        enterButton.setOnAction((ev) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((ev) -> layout.setCenter(practiceView.getView()));

        // Show the input view
        layout.setCenter(inputView.getView());

        // Create the main view and add the high leve layout
        Scene view = new Scene(layout, 400, 300);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(PracticeApp.class);
    }

}
