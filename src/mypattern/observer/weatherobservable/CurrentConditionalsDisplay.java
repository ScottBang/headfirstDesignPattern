package mypattern.observer.weatherobservable;

public class CurrentConditionalsDisplay implements Observer, DisplayElement {
    private float temperature;          // 기온
    private float humidity;             // 습도
    private WeatherData weatherData;    //

    public CurrentConditionalsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 상태: 온도 ");
        sb.append(this.temperature);
        sb.append("F, 습도 ");
        sb.append(this.humidity);
        sb.append("% 입니다.");
        System.out.println(sb.toString());
    }

    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        display();
    }
}
