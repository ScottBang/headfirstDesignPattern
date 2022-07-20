package mypattern.decorate.starbuz00;

public class DarkRost extends Beverage{

    public DarkRost(){
        this.description = "최고의 다크 로스트 커피";
        this.costValue = 3.5f;
    }

    public void setCost(float value){
        this.costValue = value;
    }
}
