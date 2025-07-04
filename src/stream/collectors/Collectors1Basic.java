package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-04
 * 풀이방법
 **/


public class Collectors1Basic {
    public static void main(String[] args) {
        List<String> list = Stream.of("java", "Spring", "JPA")
                .collect(Collectors.toList()); // 수정 가능 리스트를 반환

        list.add("ss");
        System.out.println("list : " + list);

        Set<Integer> set = Stream.of(1,2,3,4)
                .collect(Collectors.toSet());
        System.out.println("set : " + set);

        TreeSet<Integer> treeSet = Stream.of(3, 5, 4, 1, 2)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("treeSet : " + treeSet);


        // 수정 불가능한 리스트
        List<Integer> unmodifiableList = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());
        unmodifiableList.add(4);
        System.out.println("unmodifiableList : " + unmodifiableList);


        List<Integer> list1 = Stream.of(1, 2, 3, 4)
                .toList();
        list1.get(3);

    }
}
