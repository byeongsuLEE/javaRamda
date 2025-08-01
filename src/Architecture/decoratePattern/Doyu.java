package Architecture.decoratePattern;

import Architecture.decoratePattern.beverage.Beverage;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public class Doyu extends CondimentDecorator{

    public Doyu(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Doyu";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
