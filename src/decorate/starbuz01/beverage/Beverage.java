package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public abstract class Beverage {

    public String description = "Unknown beverage";       // 음료설명
    public BigDecimal costval = new BigDecimal("0.00");

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void display(){
        System.out.println(description + " $" + costval);
    }
}
