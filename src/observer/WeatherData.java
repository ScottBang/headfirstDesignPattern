package src.observer;

public class WeatherData {

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
    }

    // 대기압을 리턴하는 처리
    private float getPressure() {
        return 0.0F;
    }

    // 습도를 리턴하는 처리
    private float getHumidity() {
        return 0.0F;
    }

    // 기온을 리턴하는 처리.
    private float getTemperature() {
        return 0.0F;
    }
}
