package mypattern.factory.pizza02;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;   // 도우, 밀가루반죽
    protected String sauce;   // <음식의> 소스
    protected List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    // 준비 작업
    public void prepare() {
        System.out.println("준비 중 " + name);
        System.out.println("도우를 돌리는 중 ...");
        System.out.println("소스를 뿌리는 중 ...");
        System.out.println("토핑을 올리는 중: ");
        for (String topping: toppings) {
            System.out.println(" " + topping);
        }
    }
    // 굽기
    public void bake() {
        System.out.println("175도에서 25분간 굽기.");
    }
    // 자르기
    public void cut() {
        System.out.println("피자를 사선으로 자르기.");
    }
    // 포장하기
    public void box() {
        System.out.println("박스에 피자를 담기.");
    }

}
