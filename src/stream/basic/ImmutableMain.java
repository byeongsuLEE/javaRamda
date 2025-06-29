package stream.basic;

import java.util.List;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-29
 * 풀이방법
 **/


public class ImmutableMain {

    public static void main(String[] args) {
        List<Integer> originList = List.of(1, 2, 3, 4);
        System.out.println("originList = " + originList);

        List<Integer> filterList = originList.stream()
                .filter((num) -> num % 2 == 0)
                .toList();

        System.out.println("filterList = " + filterList);
        System.out.println("originList = " + originList);
    }
}
