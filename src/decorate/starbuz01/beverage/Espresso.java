package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public class Espresso extends Beverage {

    public Espresso(){
        this.description = "에스프레소";
        this.costval = new BigDecimal("1.39");
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);
        switch (size){
            case TALL:
                this.costval = new BigDecimal("1.39");
                break;
            case GRANDE:
                this.costval = new BigDecimal("1.69");
                break;
            case VENTI:
                this.costval = new BigDecimal("1.99");
                break;
        }
    }

//    public double cost() {
//        return 1.39;
//    }
}
