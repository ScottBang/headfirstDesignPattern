package mypattern.factory.pizza02.newyork;

import mypattern.factory.pizza02.hq.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        this.name = "뉴욕 스타일 페페로니 피자";
        this.dough = "씬 크러스트 도우";
        this.sauce = "마리나라 소스";

        this.toppings.add("Grated Reggiano Cheese");
        this.toppings.add("Sliced Pepperoni");
        this.toppings.add("Garlic");
        this.toppings.add("Onion");
        this.toppings.add("Mushrooms");
        this.toppings.add("Red Pepper");
    }
}
