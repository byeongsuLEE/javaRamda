package stream.downstream;

import stream.downstreamCollectors.Student;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-23
 * 풀이방법
 **/


public class DownStreamMain {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim",1,85),
                new Student("Park",1,85),
                new Student("Lee",1,85),
                new Student("Han",1,85),
                new Student("Hoon",3,90)
        );

        //1 단계벼롤 학년별로 학생들을 그룹화해라

        Map<Integer, List<Student>> collect1 = students.stream()
                .collect(Collectors.groupingBy(Student::grade));
        System.out.println("collect 1 = " + collect1);

        //2 단계 : 학년 별로 가장 점수가 높은 학생을 구해라 reducing 사용

        Map<Integer, Optional<Student>> collect2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade,
                        Collectors.reducing((s1, s2) -> s1.score() > s2.score() ? s1 : s2)
                ));
        System.out.println("collect 2 = " + collect2);

        Map<Integer, Optional<Student>> collect3 = students.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::grade,
                                Collectors.maxBy(Comparator.comparingInt(Student::score))
                        ));

        System.out.println("collect 3 " +collect3 );


        //4 단계 : 학년별로 가장 점수가 높은 학생의 이름을 구하라
        //collecting and then , maxBy 삳용

        Map<Integer, String> collect = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Student::score)),
                                sOpt -> sOpt.get().name()
                        )
                ));

        System.out.println("collect 4 = " + collect );
    }
}
