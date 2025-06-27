package lambda.lambda3;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class GenericMain3 {
    public static void main(String[] args) {
        Function<String, String> function = s -> s;
        String hello =function.apply("hello");
        System.out.println(hello);

        Function<Integer, Integer> numberFunction = n -> n * n;

        Integer num = numberFunction.apply(5);
        System.out.println(num);

    }

    @FunctionalInterface
    interface Function<T, R> {
        abstract R apply(T s);
    }

}
