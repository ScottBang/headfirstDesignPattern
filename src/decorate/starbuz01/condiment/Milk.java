package src.decorate.starbuz01.condiment;

import src.decorate.starbuz01.beverage.Beverage;

import java.math.BigDecimal;

public class Milk extends Decorator {

    public Milk(Beverage beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + ", 밀크";
        this.costval = this.beverage.costval.add(new BigDecimal("0.10"));
    }

    public double cost() {
        return this.beverage.cost() + 0.10;
    }

    public String getDescription() {
        return this.description;
    }
}
