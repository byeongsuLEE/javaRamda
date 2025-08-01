package Architecture.decoratePattern.beverage;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast";
    }


    @Override
    public double cost() {
        return 0.99;
    }
}
