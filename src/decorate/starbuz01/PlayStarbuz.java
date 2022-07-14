package src.decorate.starbuz01;

import src.decorate.starbuz01.beverage.*;
import src.decorate.starbuz01.condiment.*;

public class PlayStarbuz {
    public static void main(String[] args) {
        Beverage_abstract beverage1 = new Espresso();
        beverage1.display();

        // 모카 추가
        Beverage_abstract beverage2 = new Mocha(beverage1);
        beverage2.display();
        // 모카샷 추가
        beverage2 = new Mocha(beverage2);
        beverage2.display();
        // 우유 추가
        beverage2 = new Milk(beverage2);
        beverage2.display();
        // 휘핑크림 추가
        beverage2 = new Whip(beverage2);
        beverage2.display();


//        DarkRost coffe1 = new DarkRost();
//        Espresso coffe2 = new Espresso();
//        Mocha mocha1 = new Mocha(coffe1);
//        Mocha mocha2 = new Mocha(coffe2);
//
//        System.out.println(mocha1.getDescription() + " : " + mocha1.cost());
//        System.out.println(mocha2.getDescription() + " : " + mocha2.cost());
    }
}
