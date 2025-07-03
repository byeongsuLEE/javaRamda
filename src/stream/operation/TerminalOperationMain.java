package stream.operation;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-30
 * 풀이방법
 **/


public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // collectors 복잡한 수집이 필요할 떄
        List<Integer> evenList = integers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("짝수 리스트 : "  + evenList);
    }
}
