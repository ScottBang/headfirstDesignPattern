/**
 * Interface:
 *     내부의 모든 필드가 public static final 로 정의 되고
 *     static과 default 메서드 이외의 모든 메서드는 public abstract 로 정의 되어야 한다.
 *     필드와 메서드 앞의 제어자를 생략해도 컴파일러가 자동으로 각각의 제어자를 삽입한다.
**/
package src.strategy;

public interface FlyBehavior {
    public abstract void fly();
}
