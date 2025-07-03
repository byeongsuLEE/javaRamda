package stream.operation;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-30
 * 풀이방법
 **/


public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // collectors 복잡한 수집이 필요할 떄
        List<Integer> evenList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("짝수 리스트 : "  + evenList);



        // collectors 복잡한 수집이 필요할 떄
        List<Integer> evenList2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();


        Integer[] arr=  numbers.stream()
                        .filter(n-> n% 2==0)
                        .toArray(Integer[]::new);


        System.out.println(" count : 요소 개수");
        long count = numbers.stream()
                .filter(n -> n % 2 ==0)
                .count();

        System.out.println(count);

        System.out.println("reduce - 요소들의 합");
        //1 ,2  ->3
        // 결과값 +  다음값으로 이전 결과값과 새로운 다음값과 더함
        Optional<Integer> reduce = numbers.stream()
                .reduce((a,b) -> a+b);
        System.out.println("합계 : " + reduce.get());

        // 초기값이 있는 reduce
        int reduceSum = numbers.stream()
                .reduce(100, Integer::sum);

        System.out.println("초기값이 있는 합계 : " + reduceSum);


        System.out.println(" min  :  최소값 ");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
        System.out.println(min.get());


        System.out.println("max : 최대값 " );
        Optional<Integer> max = numbers.stream()
                .max((x, y) -> Integer.compare( x,y));
        System.out.println(max.get());


        System.out.println("findfirst - 첫 번쨰 요소");
        Optional<Integer> first = numbers.stream()
                .filter(x -> x > 5 )
                .findFirst();

        System.out.println("5보다 큰 첫 번째 숫자 : " + first.get());


        System.out.println("findany - 아무 요소나 하나 찾기");
        // 멀티 스레드 용 ?
        Optional<Integer> firstany = numbers.stream()
                .filter(x -> x > 5 )
                .findAny();

        System.out.println("5보다 큰 첫 번째 숫자 : " + firstany.get());

        System.out.println("anymatch : 조건을 만족하는 요소 존재 여부");

        boolean b = numbers.stream()
                .anyMatch(x -> x % 2 == 0);
        System.out.println("짝수가 있나 ?" + b);

        System.out.println("allMatch : 모든 요소가 조건을 만족하는가?");
        boolean b1 = numbers.stream()
                .allMatch(x -> x >0);
        System.out.println(" 조건을 만족 합니까? " + b1);


        System.out.println("13 . noneMatch : 조건을 만족하는 요소가 없는지?");
        boolean b2 = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("음수가 없나? " + b2);


    }
}
