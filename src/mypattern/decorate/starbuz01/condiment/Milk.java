package mypattern.decorate.starbuz01.condiment;

import  mypattern.decorate.starbuz01.beverage.Beverage;

import java.math.BigDecimal;

public class Milk extends Decorator {

    public Milk(Beverage beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + ", 밀크";
        this.size = this.beverage.size;
        this.setCost();
    }

    private void setCost(){
        switch (this.beverage.size){
            case TALL:
                this.costval = this.beverage.costval.add(new BigDecimal("0.10"));
                break;
            case GRANDE:
                this.costval = this.beverage.costval.add(new BigDecimal("0.20"));
                break;
            case VENTI:
                this.costval = this.beverage.costval.add(new BigDecimal("0.30"));
                break;
        }
    }
//    public double cost() {
//        return this.beverage.cost() + 0.10;
//    }

    public String getDescription() {
        return this.description;
    }
}
