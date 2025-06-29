package stream.operation;

import lambda.lambda4.OperatorMain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-29
 * 풀이방법
 **/


public class IntermediateOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //1 .filter
        System.out.println("1.  filter - 짝수만 선택");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::print);

        System.out.println();
        //2. map - 각 숫자를 제곱
        numbers.stream()
                .map(num -> num * num)
                .forEach(System.out::print);

        System.out.println();
        //3 distinct
        numbers.stream()
                .distinct()
                .forEach(System.out::print);
        System.out.println();

        //4. sorted
        Stream.of(3, 1, 3, 4, 5, 6, 7, 11, 2, 3)
                .sorted()
                .forEach(num -> System.out.print(num + " "));

        System.out.println(

        );
        //5. 커스텀 정렬
        Stream.of(3, 1, 3, 4, 5, 6, 7, 11, 2, 3)
                .sorted((a, b) -> Integer.compare(b, a))
                .forEach(num -> System.out.print(num + " "));


        System.out.println();
        //6. peek

        numbers.stream()
                .peek(n -> System.out.print("before: " + n + " , "))
                .map(n -> n * n)
                .peek(n -> System.out.print("after: " + n + " , "))
                .limit(5)
                .forEach(n -> System.out.println("최종값:  " + n));
        System.out.println();


    //9 skip - 요소 건너뛰기
        System.out.println("처음 요소 5개 건너뛰기");
        numbers.stream()
                .skip(5)
                .forEach(n-> System.out.print(n + " "));


        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println("takeWhile - 5보다 작은 동안만 선택 " );
        numbers2.stream()
                .takeWhile(n -> n < 5)
                .forEach(n-> System.out.print(n + " "));

        // 10 . dropWhile
        System.out.println("10 dropWhile - 5보다 작은 동안 건너뛰기");
        numbers2.stream()
                .dropWhile(n -> n < 5)
                .forEach(n-> System.out.print(n + " "));

    }
}
