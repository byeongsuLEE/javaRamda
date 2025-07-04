package stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-05
 * 풀이방법
 **/


public class Collectors3Group {
    public static void main(String[] args) {
        //첫 글자 알파벳을 기준으로 그룹화
        List<String> list = Stream.of("Apple", "Apple", "Bdd", "BCC", "C")
                .toList();
        Map<String, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy((str) -> str.substring(0, 1)));
        System.out.println("첫 글자로 나눈 리스트 : " + collect);


        // true와 false로 나눠봅시다
        Map<Boolean, List<String>> collect1 = list.stream()
                .collect(Collectors.partitioningBy((str) -> str.charAt(0) == 'A'));
        System.out.println("ture or false로 나누기 " + collect1);



        //통게
        IntSummaryStatistics collect2 = Stream.of("Apple", "Apple", "Bdd", "BCC", "C")
                .collect(Collectors.summarizingInt(String::length));
        System.out.println(collect2);


    }
}
