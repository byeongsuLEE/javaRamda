package Architecture.decoratePattern;

import Architecture.decoratePattern.beverage.Beverage;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
