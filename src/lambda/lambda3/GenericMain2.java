package lambda.lambda3;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class GenericMain2 {
    public static void main(String[] args) {
        Function function = new Function() {
            @Override
            public Object apply(Object s) {
                return ((String) s).toUpperCase();
            }
        };
        String hello = (String) function.apply("hello");
        System.out.println(hello);

        Function numberFunction = new Function() {
            @Override
            public Object apply(Object n) {
                return (Integer) n * (Integer) n;
            }
        };
        Integer num = (Integer) numberFunction.apply(5);
        System.out.println(num);

    }

    @FunctionalInterface
    interface Function<T>{
        abstract T apply(T s);
    }

}
