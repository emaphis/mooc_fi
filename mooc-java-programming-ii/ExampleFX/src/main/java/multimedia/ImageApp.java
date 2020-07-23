
package multimedia;

import javafx.application.Application;
import javafx.scene.Scene;;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author emaphis
 */
public class ImageApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Image imageFile = new Image("file:humming.jpg");
        ImageView image = new ImageView(imageFile);

        Pane frame = new Pane();
        frame.getChildren().add(image);

        stage.setTitle("Image Application");
        stage.setScene(new Scene(frame));
        stage.show();
    }

    public static void main(String[] args) {
        launch(ImageApp.class);
    }

}
