package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("Button");
        Label label = new Label("Label:");

        FlowPane component = new FlowPane();
        component.getChildren().add(label);
        component.getChildren().add(button);

        Scene scene = new Scene(component);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class, args);
    }

}
