package lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class Supplier1 {
    public static void main(String[] args) {

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(2);
            }
        };
        System.out.println(supplier.get());
    }
}
