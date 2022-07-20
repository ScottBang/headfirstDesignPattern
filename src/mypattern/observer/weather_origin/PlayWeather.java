package mypattern.observer.weather_origin;

public class PlayWeather {
    public static void main(String[] args) {
        WeatherData obj = new WeatherData();

        obj.update(80.0f, 60.8f, 240.0f);
        obj.update(85.2f, 50.1f, 235.0f);

    }
}
