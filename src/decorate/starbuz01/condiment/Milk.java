package src.decorate.starbuz01.condiment;

import src.decorate.starbuz01.beverage.Beverage;

import java.math.BigDecimal;

public class Milk extends Decorator {

    public Milk(Beverage beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + ", 밀크";
        this.setCost();
    }

    private void setCost(){
        switch (this.beverage.size){
            case TALL:
                this.costval = this.beverage.costval.add(new BigDecimal("0.10"));
            case GRANDE:
                this.costval = this.beverage.costval.add(new BigDecimal("0.20"));
            case VENTI:
                this.costval = this.beverage.costval.add(new BigDecimal("0.30"));
        }
    }
//    public double cost() {
//        return this.beverage.cost() + 0.10;
//    }

    public String getDescription() {
        return this.description;
    }
}
