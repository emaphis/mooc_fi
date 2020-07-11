package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("Button");
        TextField label = new TextField("Text: ");

        FlowPane component = new FlowPane();
        component.getChildren().add(label);
        component.getChildren().add(button);

        Scene scene = new Scene(component);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class, args);
    }

}
