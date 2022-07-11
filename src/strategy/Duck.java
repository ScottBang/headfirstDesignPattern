package src.strategy;

public abstract class Duck {
    // 인터페이스 형태의 속성
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    // 생성자
    public Duck() {}

    // 추상 메서드
    public abstract void display();

    // 일반 메서드
    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다.");
    }
    // fly() 구현
    public void performFly(){
        flyBehavior.fly();
    }
    // quack() 구현
    public void performQuack(){
        quackBehavior.quack();
    }
    // setter를 이용하여 flyBehavior를 동적으로 변경가능하게
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    // setter
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
