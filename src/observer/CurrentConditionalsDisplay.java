package src.observer;

public class CurrentConditionalsDisplay implements Observer, DisplayElement{
    private float temperature;          // 기온
    private float humidity;             // 습도
    private WeatherData weatherData;    //

    public CurrentConditionalsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        StringBuffer sb = new StringBuffer();
        sb.append("현재 상태: 온도 ");
        sb.append(this.temperature);
        sb.append("F, 습도 ");
        sb.append(this.humidity);
        sb.append("% 입니다.");
        System.out.println(sb.toString());
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
