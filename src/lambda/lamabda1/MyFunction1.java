package lambda.lamabda1;

import lambda.MyFunction;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-26
 * 풀이방법
 **/


public class MyFunction1 {
    public static void main(String[] args) {
        MyFunction myFunction1 = (a, b) -> a+b;
        int result = myFunction1.apply(1, 2);
        System.out.println(result);
    }
}
