package mypattern.factory.pizza02.chicago;

import mypattern.factory.pizza02.hq.Pizza;
import mypattern.factory.pizza02.hq.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        switch (type){
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
