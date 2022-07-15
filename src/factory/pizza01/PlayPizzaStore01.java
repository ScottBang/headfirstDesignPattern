package src.factory.pizza01;


public class PlayPizzaStore01 {
    public static void main(String[] args) {
        SimplePizzaFactory factory1 = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory1);

        Pizza order1 = store.orderPizza("cheese");
        System.out.println(order1.toString());
    }
}
