package multimedia;

import javafx.application.Application;
import javafx.scene.Scene;
;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author emaphis
 */


public class WritableImageApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Image imageFile = new Image("file:humming.jpg");

        PixelReader pixels = imageFile.getPixelReader();
        //ImageView image = new ImageView(imageFile);

        int width = (int) imageFile.getWidth();
        int height = (int) imageFile.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter writer = targetImage.getPixelWriter();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                Color pixelColor = pixels.getColor(x, y);
                double red = pixelColor.getRed();
                double green = pixelColor.getGreen();
                double blue = pixelColor.getBlue();
                double opacity = pixelColor.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                writer.setColor(x, y, newColor);
            }
        }

        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setTitle("Writable Image Application");
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(WritableImageApp.class);
    }

}
