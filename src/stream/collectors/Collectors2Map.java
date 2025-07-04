package stream.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-04
 * 풀이방법
 **/


public class Collectors2Map {
    public static void main(String[] args) {

        Map<String, Integer> collect = Stream.of("apple", "Banana", "Tomato")
                .collect(Collectors.toMap(key -> key, value -> value.length()));

        collect.put("apple", 1);
        System.out.println(collect );


        //Collect.toMap ()
        // 중복 키가 있을 경우  duplicate key 에러발생

//        Map<String, Integer> map2 = Stream.of("apple", "apple", "Tomato")
//                .collect(Collectors.toMap(key -> key, value -> value.length()));
//
//        System.out.println("map 2 : " + map2);



    }
}
