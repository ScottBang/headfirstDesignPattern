package mypattern.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;       // observer
    private float temperature;              // 기온
    private float humidity;                 // 습도
    private float pressure;                 // 대기압

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
    public void measurementsChanged() {
        notifyObservers();
    }

    // 대기압을 리턴하는 처리
    public float getPressure() {
        return this.pressure;
    }

    // 습도를 리턴하는 처리
    public float getHumidity() {
        return this.humidity;
    }

    // 기온을 리턴하는 처리.
    public float getTemperature() {
        return this.temperature;
    }

    public void registerObserver(Observer obj) {
        observers.add(obj);
    }

    public void removeObserver(Observer obj) {
        observers.remove(obj);
    }

    public void notifyObservers() {
        for (Observer observer: observers) {
            // 기온, 습도, 기압 데이터 업데이트
            observer.update(temperature, humidity, pressure);
        }
    }
}
