
package multipleviews;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author emaphis
 */
public class PracticeView {

    private Dictonary dictonary;
    private String word;

    public PracticeView(Dictonary dictonary) {
        this.dictonary = dictonary;
        this.word = dictonary.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label wordInstruction = new Label("Translate the word '" + word + "'");
        TextField translationField = new TextField();


        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Button addButton = new Button("Check");

        Label feedback = new Label("");

        layout.add(wordInstruction, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(addButton, 0, 2);
        layout.add(feedback, 0, 3);

        addButton.setOnAction((event) -> {
            String translation = translationField.getText();
            if (dictonary.get(word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation for the word '" + word + word + "' is '" + dictonary.get(word) + "'.");
                return;
            }

            word = dictonary.getRandomWord();
            wordInstruction.setText("Translate the word '" + word + "'");
            translationField.clear();
        });

        return layout;
    }
}

