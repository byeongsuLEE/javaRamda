package stream.basic;

import java.util.List;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-29
 * 풀이방법
 **/


public class PipelineMain {
    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);
        myStream(data);
        javaStream(data);



    }

    private static void javaStream(List<Integer> data) {
        System.out.println("java stream 시작");
        data.stream()
                .filter(num->
                        {
                            boolean isEven = num % 2 == 0;
                            System.out.println("filter() 실행: " + num + "(" + isEven + ")");
                                return isEven;
                        }
                )
                .map(num-> {

                    int map = num*10;
                    System.out.println("map() 실행 = " + num + " -> " + map);
                    return map;
                })
                .forEach(System.out::println);
    }

    private static void myStream(List<Integer> data) {
    }
}
