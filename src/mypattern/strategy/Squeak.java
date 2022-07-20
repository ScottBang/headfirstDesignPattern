package mypattern.strategy;

public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("빽~빽");
    }
}
