package random;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class WeatherApp {

    public static void main(String[] args) {

        WeatherMan forecaster = new WeatherMan();

        // save days of week.
        ArrayList<String> days = new ArrayList<>();

        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("sun");

        System.out.println("Next weeks' weather forecast");
        for (String day : days) {
            String weatherForcast = forecaster.forecast();
            int temperatureForcast = forecaster.makeAForecast();

            System.out.println(day + ": " + weatherForcast + " " + temperatureForcast);
        }
    }

}
