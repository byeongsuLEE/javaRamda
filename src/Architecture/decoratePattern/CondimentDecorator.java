package Architecture.decoratePattern;

import Architecture.decoratePattern.beverage.Beverage;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;
    public abstract String getDescription();

}
