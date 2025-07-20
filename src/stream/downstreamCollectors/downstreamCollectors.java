package stream.downstreamCollectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-05
 * 풀이방법
 **/



public class downstreamCollectors {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("아라비아", 1, 100),
                new Student("비비비비비", 1, 90),
                new Student("시시시시시", 2, 80),
                new Student("리리리리리", 2, 80),
                new Student("오오오오오", 2, 10)

        );

        // 1단계: 학년별로 학생들을 그룹화 해라.

        Map<Integer, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(
                        Student::grade
                ));
        System.out.println(collect);

        //2단계: 학년별로 학생들의 이름을 출력해라.
        Map<Integer, List<String>> collect3 = students.stream()
                .collect(Collectors.groupingBy(
                        (str) -> str.grade(),
                        Collectors.mapping(Student::name,     // 다운스트림 1: 학생 -> 이름 변환
                                           Collectors.toList())  // 다운스트림 2: 변환된 값(이름)을 List로 수집
                ));

        System.out.println(collect3);

        //3단계: 학년별로 학생들의 수를 출력해라
        Map<Integer, Long> collect1 = students.stream()
                .collect(Collectors.groupingBy(
                        st -> st.grade(),
                        Collectors.counting()
                ));

        System.out.println(collect1);

        //4단계 학년별로 학생들의 평균성적을 출력해라
        Map<Integer, Double> collect2 = students.stream()
                .collect(Collectors.groupingBy(
                        st -> st.grade(),
                        Collectors.averagingInt(s -> s.score())
                ));
        System.out.println(collect2);
    }
}
