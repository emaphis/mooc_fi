
package multipleviews;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author emaphis
 */
public class PasswordProtectedApp extends Application {

    @Override
    public void start(Stage window) throws Exception {

        // 1. Createing the view for asking a password

        // 1.1 Creating components to be used
        var instructionText = new Label("Write the pass word and press long in");
        var passwordField = new PasswordField();
        var startButton = new Button("Log in");
        var errorMessage = new Label("");

        // 1.2 creating layout and adding components to it.
        var layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(passwordField, 0, 1);
        layout.add(startButton, 0, 2);
        layout.add(errorMessage, 0, 3);

        // 1.3 styling the layout
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        // 1.4 creating the view itself ans setting it to use the layout
        var passwordView = new Scene(layout);

        // 2. Creating a view for showing the welcome message.
        var welcomeText = new Label("Welcome, this is the beginning!");

        var welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        var welcomeView = new Scene(welcomeLayout);

        // 3. Adding an event handler to the login button.
        // The view is changed if the password is right.
        startButton.setOnAction((event) -> {
            if (!passwordField.getText().trim().equals("password")) {
                errorMessage.setText("Unknown password!");
                return;
            }

            window.setTitle("Hello!");
            window.setScene(welcomeView);
        });

        window.setTitle("Log In");
        window.setScene(passwordView);
        window.show();
    }

    public static void main(String[] args) {
        launch(PasswordProtectedApp.class);
    }

}
