package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public class DarkRost extends Beverage {

    public DarkRost() {
        this.description = "Dark Rost";
        this.costval = new BigDecimal("1.99");
    }

    public double cost(){
        return 1.99;
    }

}
