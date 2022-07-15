/**
 * SimpleFactory:
 *      PizzaStore 객체에서 생성 코드만 현재 클래스로 옮겨 온 것이다.
 *      이것의 장점은
 *      1.SimplePizzaFactory 클래스를 사용하는 클라이언트가 매우 많을때 장점이 뚜렷 해 진다
 *      2.현재는 orderPizza() 만 있지만 다른 방식으로 피자 주문을 처리하는 메서드들도 다량 추가 될수 있다.
 *      3.이후 디자인에서는 클라이언트 코드에서 구상 클래스의 인스턴스를 만드는 코드를 전부 없앨수 있다.
 *
 * 평가:
 *      SimpleFactory 는 정확하게 말해서 패턴이라 부를 수는 없다. 하지만 프로로그래밍에서 자주 씌이는 관용구에 가까울 정도로 자주 씌인다.
 */

package src.factory.pizza01;


public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        switch (type){
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            case "cheese":
            default:
                pizza = new CheesePizza();
        }

        return pizza;
    }
}
