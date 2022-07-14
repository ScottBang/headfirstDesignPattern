package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "하우스 블렌드 커피";
        this.costval = new BigDecimal("0.89");
    }

    public double cost() {
        return 0.89;
    }
}
