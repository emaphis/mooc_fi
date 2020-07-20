package datavisualization;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
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
public class PartyDataApp1 extends Application {
    HashMap<String, HashMap<Integer, Double>> values;

    public PartyDataApp1() {
        this.values = readVoterFile("votedata1.txt");
    }


    @Override
    public void start(Stage stage) {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");

        // go through the parties and add them to the chart
        values.keySet().stream().forEach(party -> {
            // a different data set for each party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data to the chart
            lineChart.getData().add(data);
        });


        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(PartyDataApp1.class);
    }


    private HashMap<String, HashMap<Integer, Double>> readVoterFile(String filename) {
        var values = new HashMap<String, HashMap<Integer, Double>>();
        var yearList = new ArrayList<Integer>();

        try(Scanner data = new Scanner(Paths.get(filename))) {
            String row = data.nextLine();
            String[] stringArr = row.split("\t");
            for (int i = 1; i < stringArr.length; i++) { // skip first
                yearList.add(Integer.parseInt(stringArr[i]));
            }

            while (data.hasNext()) {
                String next = data.nextLine();
                stringArr = next.split("\t");
                String party = stringArr[0];
                HashMap<Integer, Double> map = new HashMap<>();
                for (int i = 1; i < stringArr.length; i++) {
                    if (!stringArr[i].equals("-")) {
                        int year = yearList.get(i-1);
                        String dat = stringArr[i];
                        double number = Double.parseDouble(dat);
                        map.put(year, number);
                    }

                }
                values.put(party, map);
            }

        } catch(Exception e) {
            System.err.println("Error: " + e.toString());
        }

        return values;
    }

}
