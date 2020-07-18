package application;

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


public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {

        // Main layout
        BorderPane layout = new BorderPane();

        // menu for layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        // Joke buttons
        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");

        // Add buttons to menu
        menu.getChildren().addAll(jokeButton, answerButton, explanationButton);

        layout.setTop(menu);

        // add subviews...
        StackPane jokeLayout = createView("What do you call a bear with no teeth?");
        StackPane answerLayout = createView("A gummy bear.");
        StackPane explanationLayout = createView("A bear with no teath on gums it's food");

        // set actions for buttons
        jokeButton.setOnAction((ev) -> layout.setCenter(jokeLayout));
        answerButton.setOnAction((ev) -> layout.setCenter(answerLayout));
        explanationButton.setOnAction((ev) -> layout.setCenter(explanationLayout));

        // set initial layout
        layout.setCenter(jokeLayout);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }

    private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
        System.out.println("Hello world!");
    }
}
