package src.strategy;

public class MallardDuck extends Duck{
    public MallardDuck() {
        // Duck.quackBehavior, Duck.flyBehavior 를 상속 받음.
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
