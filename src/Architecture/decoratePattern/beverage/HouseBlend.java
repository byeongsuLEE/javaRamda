package Architecture.decoratePattern.beverage;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
