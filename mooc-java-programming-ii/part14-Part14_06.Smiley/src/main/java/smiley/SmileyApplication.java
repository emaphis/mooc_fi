package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Canvas canvas = new Canvas(400, 400);
        GraphicsContext painter = canvas.getGraphicsContext2D();

        // clear canvas
        painter.setFill(Color.WHITE);
        painter.clearRect(0, 0, 400, 400);

        // draw face.
        painter.setFill(Color.BLACK);
        // eyes
        painter.fillRect(100, 50, 40, 40);
        painter.fillRect(250, 50, 40, 40);

        // mouth
        painter.fillRect(60, 150, 40, 40);
        painter.fillRect(290, 150, 40, 40);
        painter.fillRect(80, 190, 230, 30);


        BorderPane layout = new BorderPane();
        layout.setCenter(canvas);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
        System.out.println("Hello Smiley!");
    }

}
