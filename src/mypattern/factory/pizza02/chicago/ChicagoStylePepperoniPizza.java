package mypattern.factory.pizza02.chicago;

import mypattern.factory.pizza02.hq.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        this.name = "시카고 스타일 페페로니 피자";
        this.dough = "매우 두꺼운 크러스트 도우";
        this.sauce = "매실 토마토 소스";

        this.toppings.add("슈레드 모짜렐라 치즈");
        this.toppings.add("블랙 올리브");
        this.toppings.add("시금치");
        this.toppings.add("가지");
        this.toppings.add("얇게 썬 페퍼로니");
    }
}
