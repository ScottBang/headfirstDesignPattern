package mypattern.factory.pizza02.newyork;

import mypattern.factory.pizza02.hq.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        this.name = "뉴욕 스타일 소스와 치즈 피자";
        this.dough = "씬 크러스트 도우";
        this.sauce = "마리나라 소스";

        this.toppings.add("잘게 썬 레지아노 치즈");
    }
}
