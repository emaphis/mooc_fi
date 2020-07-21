package datavisualization;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 *
 * @author emaphis
 */
public class NordicDataApp extends Application {
    private List<Country> list;

    public NordicDataApp() {
        this.list = getData("nordicdata.csv");
    }

    @Override
    public void start(Stage stage) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Populations of the Nordic countries");
        barChart.setLegendVisible(false);

        XYChart.Series populations = new XYChart.Series();

        for (Country country : list) {
            populations.getData().add(new XYChart.Data(country.getName(), country.getPopulation()));
        }

        barChart.getData().add(populations);
        Scene view = new Scene(barChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(NordicDataApp.class);
    }

    static private List<Country> getData(String file) {
        List<Country> list = new ArrayList<>();

        try(Scanner data = new Scanner(Paths.get(file))) {
            while (data.hasNext()) {
                String next = data.nextLine();
                String[] pieces = next.split(",");
                String name  = pieces[0];
                int population = Integer.parseInt(pieces[1].trim());
                list.add(new Country(name, population));
            }
        } catch(Exception e) {
            System.err.println("Error: " + e.toString());
        }

        list.sort((Country c1, Country c2) -> c2.getPopulation() - c1.getPopulation());
        return list;
    }
}
