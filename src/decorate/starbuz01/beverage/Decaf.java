package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public class Decaf extends Beverage {

    public Decaf(){
        this.description = "Decaf";
        this.costval = new BigDecimal("1.89");
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);
        switch (size){
            case TALL:
                this.costval = new BigDecimal("1.89");
                break;
            case GRANDE:
                this.costval = new BigDecimal("2.19");
                break;
            case VENTI:
                this.costval = new BigDecimal("2.49");
                break;
        }
    }

//    public double cost(){
//        return 1.89;
//    }
}
