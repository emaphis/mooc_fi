package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        // set titles
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        // create the linechart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinky, Shanghai ranking");
        lineChart.setLegendVisible(false);

        // add data....
        XYChart.Series helsinkiData = new XYChart.Series();
        helsinkiData.setName("Helsinki");
        helsinkiData.getData().add(new XYChart.Data(2007, 73));
        helsinkiData.getData().add(new XYChart.Data(2008, 68));
        helsinkiData.getData().add(new XYChart.Data(2009, 72));
        helsinkiData.getData().add(new XYChart.Data(2010, 72));
        helsinkiData.getData().add(new XYChart.Data(2011, 74));
        helsinkiData.getData().add(new XYChart.Data(2012, 73));
        helsinkiData.getData().add(new XYChart.Data(2013, 76));
        helsinkiData.getData().add(new XYChart.Data(2014, 73));
        helsinkiData.getData().add(new XYChart.Data(2015, 67));
        helsinkiData.getData().add(new XYChart.Data(2016, 56));
        helsinkiData.getData().add(new XYChart.Data(2017, 56));

        lineChart.getData().add(helsinkiData);

        // display the line chart
        Scene view = new Scene(lineChart, 400, 300);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
        System.out.println("Hello world!");
    }

}
