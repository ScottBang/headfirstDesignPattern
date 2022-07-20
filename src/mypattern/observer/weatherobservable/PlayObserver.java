/*
 * 디자인 원칙
 *   1.상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다.
 *     느슨하게 결합하는 디자인을 사용하면 변경 사항이 생겨도 무난히 처리 할 수 있는 유연한 객체지향 시스템을 구축할수 있다. 객체사이의 상호 의존성을 최소화 할 수 있기 때문이다.
 *   2.
 *   3.
 *
 * Observer 패턴:
 *   한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의합니다.
 *
 * 사용 예제:
 *   버튼과 액션리스너의 관계에서 버튼은 Subject이고 리스너는 Observer 이다.
 *
 * */

package mypattern.observer.weatherobservable;

public class PlayObserver {
    public static void main(String[] args) {
        System.out.println("----- Observer Pattern -----");
        WeatherData weatherData = new WeatherData();

        CurrentConditionalsDisplay currentDisplay = new CurrentConditionalsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65,29.92f);

    }
}
