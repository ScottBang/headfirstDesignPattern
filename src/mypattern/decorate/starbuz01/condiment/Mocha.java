package mypattern.decorate.starbuz01.condiment;

import  mypattern.decorate.starbuz01.beverage.Beverage;

import java.math.BigDecimal;

public class Mocha extends Decorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + ", 모카";
        this.size = this.beverage.size;
        this.setCost();
    }

    private void setCost(){
        switch (this.beverage.size){
            case TALL:
                this.costval = this.beverage.costval.add(new BigDecimal("0.20"));
                break;
            case GRANDE:
                this.costval = this.beverage.costval.add(new BigDecimal("0.30"));
                break;
            case VENTI:
                this.costval = this.beverage.costval.add(new BigDecimal("0.40"));
                break;
        }
    }
//    public double cost() {
//        return this.beverage.cost() + 0.20;
//    }

    public String getDescription() {
        return this.description;
    }
}
