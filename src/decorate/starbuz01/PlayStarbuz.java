package src.decorate.starbuz01;

import src.decorate.starbuz01.beverage.*;
import src.decorate.starbuz01.condiment.*;

public class PlayStarbuz {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        // 사이즈 변경.
        beverage1.setSize(Beverage.Size.GRANDE);
        beverage1.display();

        // 모카 추가
        Beverage beverage2 = new Mocha(beverage1);
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


    }
}
