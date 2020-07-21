
package datavisualization;

import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 *
 * @author emaphis
 */
public class AnimationApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Random random = new Random();

        NumberAxis xAxis = new NumberAxis();
        // y-axis representd the average of the rolls, The average is always betwee [1-6]
        NumberAxis yAxis = new NumberAxis(1, 6, 1);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        // remove some of the elements
        lineChart.setLegendVisible(false);
        lineChart.setAnimated(false);
        lineChart.setCreateSymbols(false);

        // create a variable representing the data and add it to the chart
        XYChart.Series average = new XYChart.Series();
        lineChart.getData().add(average);

        new AnimationTimer() {
            private long previous;
            private long sum;
            private long count;

            @Override
            public void handle(long current) {
                if (current - previous < 100_100_000L) {
                    return;
                }

                previous = current;

                // roll the dice
                int number = random.nextInt(6) + 1;

                // we grow the sum and increment the count
                sum += number;
                count++;

                // we add a new data point to the chart
                average.getData().add(new XYChart.Data(count, 1.0 * sum / count));
            }
        }.start();

        Scene scene = new Scene(lineChart, 400, 300);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(AnimationApp.class);
    }

}
