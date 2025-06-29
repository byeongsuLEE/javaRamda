package stream.basic;

import java.util.List;
import java.util.stream.Stream;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-29
 * 풀이방법
 **/


public class DuplicateExcuteMain {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        integerStream.forEach(System.out::println);

        //integerStream.forEach(System.out::println);//위에 실행 했는데 또 실행하면 에러남 //IllegalStateException

        //2번 쓰는 방법
         List<Integer> list = List.of(1,2,3);
         Stream.of(list).forEach(System.out::println);
         Stream.of(list).forEach(System.out::println);

    }
}
