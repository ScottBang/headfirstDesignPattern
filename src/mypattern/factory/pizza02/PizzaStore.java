/**
 * PizzaStore 추상 클래스
 *   - 각 지점의 PizzaStore가 상속받을 수 있도록 하되, orderPizza() 메서드는 그대로 사용하도록 강제 한다.
 */

package mypattern.factory.pizza02;


public abstract class PizzaStore {
    /**
     * orderPizza는 상속받는 클래스가 그대로 사용하도록 강제하기 위해 final 제어자를 넣음.
     */
    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
