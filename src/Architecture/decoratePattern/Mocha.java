package Architecture.decoratePattern;

import Architecture.decoratePattern.beverage.Beverage;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
