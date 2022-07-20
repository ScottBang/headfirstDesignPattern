package mypattern.observer.weatherobservable;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void display() {
        System.out.print("기상예보: ");
        if (currentPressure > lastPressure) {
            System.out.println("가는 길에 날씨가 좋아집니다!");
        } else if (currentPressure == lastPressure) {
            System.out.println("지금과 비슷할 것 같습니다.");
        } else if (currentPressure < lastPressure) {
            System.out.println("선선하고 비오는 날씨에 조심하십시오");
        }
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = this.weatherData.getPressure();

        display();
    }
}
