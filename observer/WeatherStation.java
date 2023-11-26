package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80f, 65f, 30.4f);
        weatherData.setMeasurements(70f, 70f, 20.8f);
    }
}
