package src.decorate.starbuz01.condiment;

import src.decorate.starbuz01.beverage.Beverage;

import java.math.BigDecimal;

public class Mocha extends Decorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + ", 모카";
        this.setCost();
    }

    private void setCost(){
        switch (this.beverage.size){
            case TALL:
                this.costval = this.beverage.costval.add(new BigDecimal("0.20"));
            case GRANDE:
                this.costval = this.beverage.costval.add(new BigDecimal("0.30"));
            case VENTI:
                this.costval = this.beverage.costval.add(new BigDecimal("0.40"));
        }
    }
//    public double cost() {
//        return this.beverage.cost() + 0.20;
//    }

    public String getDescription() {
        return this.description;
    }
}
