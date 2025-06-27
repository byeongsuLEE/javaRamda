package lambda.lambda3;

import java.sql.SQLOutput;
import java.util.function.Consumer;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 받기만 하고 리턴은 안함
 **/


public class Consumer1 {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello");
    }
}
