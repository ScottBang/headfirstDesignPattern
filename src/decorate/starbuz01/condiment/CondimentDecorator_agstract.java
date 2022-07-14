/**
 * 첨가물(condiment)을 나타내는 추상 클래스(Decorator 클래스)
 *      첨가물 추상클래스가 음료 추상클래스를 상속함.
 */
package src.decorate.starbuz01.condiment;

import src.decorate.starbuz01.beverage.Beverage_abstract;

public abstract class CondimentDecorator_agstract extends Beverage_abstract {
    Beverage_abstract beverage;

    public abstract String getDescription();
}
