package src.decorate.starbuz01.condiment;

import src.decorate.starbuz01.beverage.Beverage_abstract;

import java.math.BigDecimal;

public class Milk extends CondimentDecorator_agstract{

    public Milk(Beverage_abstract beverage){
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
