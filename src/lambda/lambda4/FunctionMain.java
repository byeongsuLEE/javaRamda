package lambda.lambda4;

import java.util.function.Function;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class FunctionMain {
    public static void main(String[] args) {
        //익명 클래스

        Function<String ,String> function= new Function<String,String>() {
            @Override
            public String apply(String s){
                return s;
            }
        };

        System.out.println(function.apply("hello"));

    }
}
