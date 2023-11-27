package observer.starter;

import observer.starter.DisplayDevices.CurrentConditionsDIsplay;
import observer.starter.DisplayDevices.ForecastDisplay;
import observer.starter.DisplayDevices.StatisticsDisplay;

public class WeatherData {
    // declare instance variables for all devices
    CurrentConditionsDIsplay currentConditionsDisplay = new CurrentConditionsDIsplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();

    public void measurementsChanged () {
        // retrieve data
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // update data on diferent devices
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    public float getTemperature() { return 1f;}
    public float getHumidity() { return 2f; }
    public float getPressure() { return 3f; }
}
