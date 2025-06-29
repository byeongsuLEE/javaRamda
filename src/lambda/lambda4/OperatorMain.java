package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
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
        Function<Integer,Integer> binaryOperator = (a) ->a ;

        Function<Integer,Integer> binaryOperator1 = binaryOperator::apply; ;


        BiFunction<Integer, Integer, String> biFunction = (a, b)-> "answer = " + (a+b);
        System.out.println(biFunction.apply(10,20));
    }
}
