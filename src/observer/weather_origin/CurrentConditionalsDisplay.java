/**
 * 현재상태(Conditional) 표시 장비:
 *      기온, 습도 정보를 표시한다.
 */

package src.observer.weather_origin;

public class CurrentConditionalsDisplay {
    private float temperature;          // 기온
    private float humidity;             // 습도

    public CurrentConditionalsDisplay(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void update(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("현재 상태: 온도 ");
        sb.append(this.temperature);
        sb.append("F, 습도 ");
        sb.append(this.humidity);
        sb.append("% 입니다.");
        System.out.println(sb);
    }
}
