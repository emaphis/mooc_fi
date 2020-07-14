package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea text = new TextArea();
        layout.setCenter(text);
        HBox hbox = new HBox();
        hbox.setSpacing(20);

        Label lettersLabel = new Label();
        Label wordsLabel = new Label();
        Label longestLabel = new Label();

        hbox.getChildren().add(lettersLabel);
        hbox.getChildren().add(wordsLabel);
        hbox.getChildren().add(longestLabel);
        layout.setBottom(hbox);

        text.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            lettersLabel.textProperty().set("Letters: " + characters);
            wordsLabel.textProperty().set("Words: " + words);
            longestLabel.textProperty().set("The longest word is: " + longest);
        });

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class, args);
    }

}
