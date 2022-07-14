package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage {

    public Espresso(){
        this.description = "에스프레소";
        this.costval = new BigDecimal("1.39");
    }

    public double cost() {
        return 1.39;
    }
}
