package lambda.lambda2;

import java.util.ArrayList;
import java.util.List;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-26
 * 풀이방법
 **/


public class LambdaReduce {

    interface MyReducer {
        int reduce(int a, int b);
    }

    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {

        int result = initial;
        for(int val : list){
            result = reducer.reduce(result, val);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        //1 합 구하기 (초기값 0 , 덧셈 로직)
        int sum = reduce(list, 0, (a, b) -> a + b);
        System.out.println("sum = " + sum);
        //2. 곱 구하기 (초기값 1, 곱셈 로직)
        int product = reduce(list, 1, (a, b) -> a * b);
        System.out.println("product = "  + product);
    }
}
