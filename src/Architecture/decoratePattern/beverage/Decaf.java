package Architecture.decoratePattern.beverage;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf";
    }


    @Override
    public double cost() {
        return 1.05;
    }
}
