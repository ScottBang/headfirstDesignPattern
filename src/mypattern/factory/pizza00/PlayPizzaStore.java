package mypattern.factory.pizza00;


public class PlayPizzaStore {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza order1 = store.orderPizza("cheese");
        System.out.println(order1.toString());
    }
}
