package src.decorate.starbuz00;

public class Beverage {
    protected String description;
    protected boolean milk = false;
    protected boolean soy = false;        // 두유
    protected boolean mocha = false;      //
    protected boolean whip = false;       // 휘프: 생크림·달걀 흰자를 거품을 내서 만든 디저트.
    protected float costValue = 0.0f;

    public String getDescription() {
        return this.description;
    }

    public float cost(){
        return costValue;
    }

    public void display() {
        System.out.println(this.description + " : " + cost());
    }

    public boolean hasMilk(){
        return this.milk;
    }

    public void setMilk(boolean value){
        this.milk = value;
    }

    public boolean hasSoy(){
        return this.soy;
    }

    public void setSoy(boolean value){
        this.soy = value;
    }

    public boolean hasWhip(){
        return this.whip;
    }

    public void setWhip(boolean value){
        this.whip = value;
    }

}
