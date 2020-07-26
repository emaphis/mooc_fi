
package larger;

import java.util.concurrent.atomic.AtomicInteger;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import javafx.stage.Stage;

public class PointsApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(400, 300);
        Text text = new Text(10, 20, "Points: 0");
        pane.getChildren().add(text);

        AtomicInteger points = new AtomicInteger();

        Scene scene = new Scene(pane);
        stage.setTitle("Counter App");
        stage.setScene(scene);
        stage.show();

        new AnimationTimer() {

            @Override
            public void handle(long now) {
                text.setText("Points: " + points.incrementAndGet());
            }

        }.start();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
