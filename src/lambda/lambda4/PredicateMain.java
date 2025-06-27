package lambda.lambda4;

import java.util.function.Predicate;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i < 10;
        System.out.println(p1.test(9));
    }
}
