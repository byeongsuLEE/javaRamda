package lambda.lambda3;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class GenericMain1 {
    public static void main(String[] args) {
        Function function = s -> ((String)s).toUpperCase();
        String hello = (String) function.apply("hello");
        System.out.println(hello);

        Function numberFunction = n -> (Integer) n*(Integer)n;
        Integer num = (Integer) numberFunction.apply(5);
        System.out.println(num);

    }

    @FunctionalInterface
    interface Function<T>{
        abstract T apply(T s);
    }

}
