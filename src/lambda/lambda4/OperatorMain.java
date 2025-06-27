package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class OperatorMain {
    public static void main(String[] args) {
        //UnaryOperator
        UnaryOperator<String> unaryOperator = (s)-> s.toUpperCase();
        System.out.println(unaryOperator.apply("hello"));

        //binaryOperator
        BinaryOperator<Integer> binaryOperator = (a, b)-> a+b;
        System.out.println(binaryOperator.apply(10,20));

        BiFunction<Integer, Integer, String> biFunction = (a, b)-> "answer = " + (a+b);
        System.out.println(biFunction.apply(10,20));
    }
}
