package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update() {
        // use getter methods to pull data from the subject
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        String format = "Current conditions: %.1fF degrees and %.1f%% humidity.\n";
        System.out.printf(format, temperature, humidity);
    }
}
