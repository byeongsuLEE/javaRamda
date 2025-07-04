package stream.collectors;

import java.util.LinkedHashMap;
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


        //Collect.md.toMap ()
        // 중복 키가 있을 경우  duplicate key 에러발생
//        Map<String, Integer> map2 = Stream.of("apple", "apple", "Tomato")
//                .collect(Collectors.toMap(key -> key, value -> value.length()));
//
//        System.out.println("map 2 : " + map2);


        Map<String, Integer> map3 = Stream.of("apple", "apple", "Tomato")
                .collect(Collectors.toMap(
                        key -> key,
                        value -> value.length(),
                        (oldVal, newVal) -> oldVal + newVal //충돌나면 더해버릴게
                ));

        System.out.println("map 3 중복된 키 에러 수정 : " + map3);


        Map<String, Integer> map4 = Stream.of("apple", "apple", "Tomato")
                .collect(Collectors.toMap(
                        key -> key,
                        value -> value.length(),
                        (oldVal, newVal) -> oldVal + newVal , //충돌나면 더해버릴게
                        LinkedHashMap::new
                ));

        System.out.println("map 4 타입을 지정 : " + map4.getClass());


    }
}
