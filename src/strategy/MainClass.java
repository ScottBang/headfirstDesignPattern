package src.strategy;


public class MainClass {
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
