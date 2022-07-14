package src.decorate.starbuz01.condiment;

import src.decorate.starbuz01.beverage.Beverage_abstract;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator_agstract{

    public Soy(Beverage_abstract beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + ", 두유";
        this.costval = this.beverage.costval.add(new BigDecimal("0.15"));
    }

    public double cost() {
        return this.beverage.cost() + 0.15;
    }

    public String getDescription() {
        return this.description;
    }
}
