package mypattern.factory.pizza02.newyork;

import mypattern.factory.pizza02.Pizza;
import mypattern.factory.pizza02.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        switch (type){
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "cleam":
                return new NYSStyleClamPizza();
            case "greek":
                return new NYStyleGreekPizza();
            default:
                return null;
        }
    }
}
