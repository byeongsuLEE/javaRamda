package lambda.lambda3;

import java.util.function.Function;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class TargetType1 {
    public static void main(String[] args) {

        Function<String,String> a = s -> s.toUpperCase();
        Function<String, String> b= a;
}
}
