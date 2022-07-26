/**
 * 뉴욕 스타일 피자 팩토리
 */

package mypattern.factory.pizza02.newyork;

import mypattern.factory.pizza02.hq.Pizza;
import mypattern.factory.pizza02.hq.PizzaStore;

public class NYPizzaFactory extends PizzaStore {
    protected Pizza createPizza(String type) {
        return null;
    }
}
