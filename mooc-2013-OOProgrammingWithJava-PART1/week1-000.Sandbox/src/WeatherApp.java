
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class WeatherApp {
    public static void main(String[] args) {
        WeatherForecaster forecaster = new WeatherForecaster();

        // Use a list to organize things
        ArrayList<String> days = new ArrayList<String>();
        Collections.addAll(days, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

        System.out.println("Weather forecast for the next week: ");
        for (String day: days) {
            String weatherForecast = forecaster.forecastWeather();
            int temperatureForecast = forecaster.forecastTemperature();

            System.out.println(day + ": " + weatherForecast + " "
                    + temperatureForecast + " degree");
        }
    }
}
