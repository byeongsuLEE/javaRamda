package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-29
 * 풀이방법
 **/


public class CreateStreamMain {
    public static void main(String[] args) {
        System.out.println("1. 컬렉션으로부터 생성");
        List<String> list = List.of("a","b","c");
        Stream<String> stream = list.stream();

        String [] abc = {"a","b","c"};
        Arrays.stream(abc).forEach(System.out::println);


        System.out.println("3. stream.of 사용");
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        integerStream.forEach(System.out::println);

        System.out.println("4. 무한 스트림 생성 - iterate()");
        // iterate : 초기값과 다음 값을 만드는 함수를 지정
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
        infiniteStream.limit(3).forEach(System.out::println);

        System.out.println("5. 무한 스트림 생성 - generate()");
        // generate : supplier를 사용하여 무한하게 생성
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }
}
