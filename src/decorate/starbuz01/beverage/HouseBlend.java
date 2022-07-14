package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "하우스 블렌드 커피";
        this.costval = new BigDecimal("0.89");
    }

    @Override
    public void setSize(Size size) {
        super.setSize(size);
        switch (size){
            case TALL:
                this.costval = new BigDecimal(".89");
            case GRANDE:
                this.costval = new BigDecimal("1.19");
            case VENTI:
                this.costval = new BigDecimal("1.49");
        }
    }

//    public double cost() {
//        return 0.89;
//    }
}
