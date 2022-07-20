package mypattern.factory.pizza00;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public Pizza(){
        this.name = "Normal pizza";
    }
    public String getName() {
        return name;
    }

    // 준비 작업
    public void prepare() {
        System.out.println("Preparing " + name);
    }
    // 굽기
    public void bake() {
        System.out.println("Baking " + name);
    }
    // 자르기
    public void cut() {
        System.out.println("Cutting " + name);
    }
    // 포장하기
    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
