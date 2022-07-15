package src.factory.pizza00;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        /**
         * 메뉴 변화에 따라 계속 바뀌는 부분.
         */
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
//            case "greek" -> new GreekPizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> new Pizza();
        };

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
