package stream.operation;

import java.sql.SQLOutput;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-04
 * 풀이방법
 **/


public class PrimitiveStreamMain {
    public static void main(String[] args) {
        // 기본형  특화 스트림 생성 (long ,int , double stream)

        // 애는 기본형을 다룸
        // 참조형이 아니야
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        intStream.forEach( i -> System.out.print((i + " ")));
        System.out.println();

        //범위 생성 메서드
        IntStream range = IntStream.range(1, 6);
        range.forEach( i -> System.out.print((i + " ")));
        System.out.println();

        // 맨 끝값도 포함
        IntStream.rangeClosed(1, 6).forEach( i -> System.out.print((i + " ")));
        System.out.println();

        // 1. 통계 관련 메서드 (sum, max,average ,min , count)

        int sum = IntStream.range(1, 6).sum();
        System.out.println(sum);

        double asDouble = IntStream.range(1, 6).average()
                .getAsDouble();
        System.out.println(asDouble);

        //summaryStatic : 모든 통계 정보
        IntSummaryStatistics intSummaryStatistics = IntStream.range(1, 6).summaryStatistics();
        System.out.println(intSummaryStatistics.getAverage());

        //2. 타입 변환 메서드
        // int -> long stream으로 바꿔보자
        LongStream longStream = IntStream.range(1, 6)
                .asLongStream();

        DoubleStream doubleStream = IntStream.range(1, 6)
                .asDoubleStream();

        // INTSTREAM -> STREAM<Integer>
        Stream<Integer> boxed = IntStream.range(1, 6).boxed();

        //3 기본형 특화 매핑
        //int -> long 변환 매핑
        LongStream longStream1 = IntStream.range(1, 5).mapToLong(i -> i * 1L);

        //int -> double
        DoubleStream doubleStream1 = IntStream.range(1, 5)
                .mapToDouble(i -> i * 1.5);

        //int -> 객체 변환 매핑
        Stream<String> stringStream = IntStream.range(1, 5)
                .mapToObj(i -> "Number : " + i);


        //4. 객체 스트림 -> 기본형 특화 스트림으로 매핑
        // Stream <Integer> -> Intstream
        int sum1 = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum1);


        List<Integer> list = List.of(1,2,3,4);
        IntSummaryStatistics intSummaryStatistics1 = list.stream()
                .mapToInt(i -> i)
                .summaryStatistics();

        System.out.println(intSummaryStatistics1.getAverage());
    }
}
