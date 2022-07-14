package src.decorate.starbuz01.condiment;

import src.decorate.starbuz01.beverage.Beverage_abstract;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator_agstract{

    public Mocha(Beverage_abstract beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + ", 모카";
        this.costval = this.beverage.costval.add(new BigDecimal("0.20"));
    }
    public double cost() {
        return this.beverage.cost() + 0.20;
    }

    public String getDescription() {
        return this.description;
    }
}
