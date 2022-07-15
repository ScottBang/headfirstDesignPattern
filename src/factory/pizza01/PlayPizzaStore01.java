package src.factory.pizza01;


public class PlayPizzaStore01 {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza order1 = store.orderPizza("cheese");
        System.out.println(order1.toString());
    }
}
