package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.ToIntFunction;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class PrimitiveFunction {
    public static void main(String[] args) {
       // 기본형 매개변수 Int,Long,Double function
        IntFunction<String> function = n -> "숫자 = "+n;
        System.out.println(function.apply(1));

        //기본형 반환 , toIntFunction
        ToIntFunction<String> func = s -> s.length();
        System.out.println(func.applyAsInt("ggdsg"));

        // 기본형 매개변수, 기본형 반환
        IntToLongFunction intToLongFunction = x-> x*100L;
        System.out.println(intToLongFunction.applyAsLong(3));

    }
}
