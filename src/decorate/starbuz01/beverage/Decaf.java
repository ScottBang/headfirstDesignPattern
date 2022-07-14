package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public class Decaf extends Beverage {

    public Decaf(){
        this.description = "Decaf";
        this.costval = new BigDecimal("1.89");
    }

    public double cost(){
        return 1.89;
    }
}
