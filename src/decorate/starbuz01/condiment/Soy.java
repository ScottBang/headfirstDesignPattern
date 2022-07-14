package src.decorate.starbuz01.condiment;

import src.decorate.starbuz01.beverage.Beverage;

import java.math.BigDecimal;

public class Soy extends Decorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
        this.description = this.beverage.getDescription() + ", 두유";
        this.setCost();
    }

    private void setCost(){
        switch (this.beverage.size){
            case TALL:
                this.costval = this.beverage.costval.add(new BigDecimal("0.15"));
            case GRANDE:
                this.costval = this.beverage.costval.add(new BigDecimal("0.25"));
            case VENTI:
                this.costval = this.beverage.costval.add(new BigDecimal("0.35"));
        }
    }

//    public double cost() {
//        return this.beverage.cost() + 0.15;
//    }

    public String getDescription() {
        return this.description;
    }
}
