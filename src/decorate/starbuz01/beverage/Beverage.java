package src.decorate.starbuz01.beverage;

import java.math.BigDecimal;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    public Size size = Size.TALL;
    public String description = "Unknown beverage";       // 음료설명
    public BigDecimal costval = new BigDecimal("0.00");

    public String getDescription() {
        return description;
    }

//    public abstract double cost();

    public void display(){
        System.out.printf("%s '%s' size: $%3.2f \n", description, size, costval);
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }
}
