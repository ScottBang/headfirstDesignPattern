/**
 * 통계(Statistic) 표시장비:
 *      평균온도/최고온도/최저온도 정보를 표시한다.
 */
package mypattern.observer.weather_origin;

public class StatisticsDisplay {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsDisplay(float temp, float humidity, float pressure){
        update(temp, humidity, pressure);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("평균온도/최고온도/최저온도 = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
