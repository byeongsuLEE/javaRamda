package Architecture.decoratePattern;

import Architecture.decoratePattern.beverage.Beverage;
import Architecture.decoratePattern.beverage.DarkRoast;
import Architecture.decoratePattern.beverage.Espresso;
import Architecture.decoratePattern.beverage.HouseBlend;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3 = new Doyu(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
