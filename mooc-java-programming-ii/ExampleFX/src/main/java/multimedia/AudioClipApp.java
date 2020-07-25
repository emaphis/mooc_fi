
package multimedia;

import javafx.application.Application;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;


/**
 *
 * @author emaphis
 */
public class AudioClipApp extends Application {

    @Override
    public void start(Stage stage) {

        AudioClip sound = new AudioClip("file:bell.wav");
        sound.play();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
