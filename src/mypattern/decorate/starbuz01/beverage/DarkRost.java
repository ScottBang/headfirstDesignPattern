package mypattern.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public class DarkRost extends Beverage {

    public DarkRost() {
        this.description = "Dark Rost";
        this.costval = new BigDecimal("1.99");
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);

        switch (size){
            case TALL:
                this.costval = new BigDecimal("1.99");
                break;
            case GRANDE:
                this.costval = new BigDecimal("2.29");
                break;
            case VENTI:
                this.costval = new BigDecimal("2.59");
                break;
        }
    }

//    public double cost(){
//        return 1.99;
//    }

}
