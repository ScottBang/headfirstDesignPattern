/*
 * 디자인 원칙
 *     1.애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분과 분리한다.
 *     2.'구현'보다는 '인터페이스'에 맞춰서 프로그래밍 한다.
 *     3.'상속'보다는 'Composition(구성)'을 활용한다.
 *
 * Strategy(전략) 패턴:
 *     알고리즘 군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해 준다.
 *     전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할수 있다.
 *
 * */

package mypattern.strategy;


public class PlayStrategy {
    public static void main(String[] args) {
        String LINE_SP = "------------------------------";

        // 물오리
        System.out.println(LINE_SP);
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        // 모형 오리
        System.out.println(LINE_SP);
        Duck model = new ModelDuck();
        model.display();
        // 기본으로 날지 못함.
        model.performFly();
        // 로켓 장착
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
