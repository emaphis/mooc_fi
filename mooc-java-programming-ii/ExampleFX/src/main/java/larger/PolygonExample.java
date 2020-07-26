package larger;

import java.util.HashMap;
import java.util.Map;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author emaphis
 */
public class PolygonExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(300, 200);

        Polygon parallelogram = new Polygon(0, 0, 100, 0, 100, 50, 0, 50);

        // move parallelogram
        parallelogram.setTranslateX(100);
        parallelogram.setTranslateY(20);

        pane.getChildren().add(parallelogram);

        Scene scene = new Scene(pane);

        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });

        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

        Point2D movement = new Point2D(1, 2);

        new AnimationTimer() {

            @Override
            public void handle(long now) {
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    parallelogram.setRotate(parallelogram.getRotate() - 5);
                }

                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    parallelogram.setRotate(parallelogram.getRotate() + 5);
                }

                parallelogram.setTranslateX(parallelogram.getTranslateX() + movement.getX());
            }
        }.start();

        stage.setTitle("Polygon App 123");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("got here aaa...");
        launch(args);
        System.out.println("got here bbb....");
    }
}
