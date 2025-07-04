package stream.collectors;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-05
 * 풀이방법
 **/


public class CollectorsReducing {
    public static void main(String[] args) {
        
        //컬렉션의 리듀싱은 주로 다운 스트림에서 사용
        // 모든 이름을 하나의 문자열로 이어 붙이기
        List<String> names = List.of("a", "b", "c", "d");
        String joined = names.stream()
                .collect(Collectors.reducing(
                        (s1, s2) -> s1 + " " + s2
                )).get();
        System.out.println(joined);

        Optional<String> reduce = names.stream()
                .reduce((s1, s2) -> s1 + " " + s2);
        System.out.println("joined 2 : "  + reduce.get());

        //문자열 전용 기능
        //reduce == Collector.joining(",")
        String joined3 = names.stream()
                .collect(Collectors.joining(","));
        System.out.println("JOINED 3 : " + joined3);

        String join = String.join(",", "a", "b");
        System.out.println(join);

    }
    
}
