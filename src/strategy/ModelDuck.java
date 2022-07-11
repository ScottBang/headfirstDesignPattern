package src.strategy;

public class ModelDuck extends Duck{
    public ModelDuck(){
        // 모형오리는 날지 못함.
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 모형오리 입니다.");
    }
}
