package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MultipleViews extends Application  {

    @Override
    public void start(Stage window) {

        // First View.
        BorderPane pane1 = new BorderPane();
        Label label1 = new Label("First View!");
        Button button1 = new Button("To the second view!");
        pane1.topProperty().set(label1);
        pane1.centerProperty().set(button1);
        Scene first = new Scene(pane1);

        // Second view.
        VBox vbox2 = new VBox();
        Button button2 = new Button("To the third view!");
        Label label2 = new Label("Second view!");
        vbox2.getChildren().addAll(button2, label2);
        Scene second = new Scene(vbox2);

        // Third view.
        GridPane pane3 = new GridPane();
        Label label3 = new Label("Third view!");
        Button button3 = new Button("To the first view!");
        pane3.add(label3, 0, 0);
        pane3.add(button3, 1, 1);
        Scene third = new Scene(pane3);


        button1.setOnAction((event) -> {
            window.setScene(second);
        });

        button2.setOnAction((event) -> {
            window.setScene(third);
        });

        button3.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class, args);
    }

}
