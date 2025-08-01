package Architecture.decoratePattern.beverage;

/**
 * 작성자  : lbs
 * 날짜    : 2025-08-01
 * 풀이방법
 **/


public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
