package methodRef.start;

import java.util.function.BinaryOperator;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-28
 * 풀이방법
 **/


public class MethodRefStartv1 {
    public static void main(String[] args) {
        //똑같은걸 2개 쓰면 안좋음
        BinaryOperator<Integer> add1 = (x, y) -> x + y;
        BinaryOperator<Integer> add2 = (x, y) -> x + y;

        System.out.println(add1.apply(1,2));
        System.out.println(add2.apply(1,2));


    }
}
