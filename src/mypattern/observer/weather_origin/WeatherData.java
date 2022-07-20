/**
 * 기상정보 제공 클래스
 *      기온, 습도, 대기압 값을 제공할 수 있다.
 */
package mypattern.observer.weather_origin;

public class WeatherData {
    private float temperature = 0.0f;   // 기온
    private float humidity = 0.0f;      // 습도
    private float pressure = 0.0f;      // 대기압

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    // 기상 관측값이 변경시 처리
    public void measurementsChanged() {
        CurrentConditionalsDisplay display1 = new CurrentConditionalsDisplay(this.temperature, this.humidity);
        StatisticsDisplay display2 = new StatisticsDisplay(this.temperature, this.humidity, this.pressure);
    }
}
