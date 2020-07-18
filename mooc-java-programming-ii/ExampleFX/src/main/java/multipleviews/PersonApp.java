
package multipleviews;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * @author emaphis
 */
public class PersonApp extends Application {
    private PersonWarehouse warehouse = new MyPersonWarehouse();

    @Override
    public void start(Stage window) {

        Label nameText = new Label("Name: ");
        TextField nameField = new TextField();
        Label secText = new Label("Social security number: ");
        TextField secField = new TextField();

        Button addButton = new Button("Add person!");

        addButton.setOnAction((event) -> {
            warehouse.save(new Person(nameText.getText(), secText.getText()));
        });

        GridPane components = new GridPane();
        components.add(nameText, 0, 0);
        components.add(nameField, 1, 0);
        components.add(secText, 0, 1);
        components.add(secField, 1, 1);
        components.add(addButton, 1, 2);

        // Add some style to the ui
        components.setHgap(10);
        components.setVgap(10);
        components.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(components);

        window.setTitle("Add Person");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        PersonApp app = new PersonApp();

        //app.launch(PersonApp.class);
        //System.out.println(wa);
    }
}
