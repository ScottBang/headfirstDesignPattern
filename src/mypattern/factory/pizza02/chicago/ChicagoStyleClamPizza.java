package mypattern.factory.pizza02.chicago;

import mypattern.factory.pizza02.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza(){
        this.name = "시카고 스타일 조개 피자";
        this.dough = "두터운 크러스트 도우";
        this.sauce = "마리나라 소스";

        this.toppings.add("잘게 썬 레지아노 치즈");
        toppings.add("아이스랜드의 신선한 조개");
    }
}
