package stream.start;

import java.util.ArrayList;
import java.util.List;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-29
 * 풀이방법
 **/


public class StreamStartMain {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana","Berry", "Tomato");
       list.stream()
                .filter((name) -> name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
