
package multimedia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 *
 * @author emaphis
 */
public class DrawingApp extends Application {

    @Override
    public void start(Stage stage) {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(colorPalette.getValue());
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene view = new Scene(paintingLayout);

        stage.setTitle("Drawing Application");
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(DrawingApp.class);
        System.out.println("***** Hello Drawing App *****");
    }
}
