package mypattern.factory.pizza02.newyork;

import mypattern.factory.pizza02.Pizza;

public class NYSStyleClamPizza extends Pizza{
    public NYSStyleClamPizza(){
        this.name = "뉴욕 스타일 조개 피자";
        this.dough = "씬 크러스트 도우";
        this.sauce = "마리나라 소스";

        this.toppings.add("잘게 썬 레지아노 치즈");
        toppings.add("아이스랜드의 신선한 조개");
    }
}
