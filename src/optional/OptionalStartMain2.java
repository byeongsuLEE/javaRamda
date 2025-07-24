package optional;

import java.sql.SQLOutput;
import java.util.Optional;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-23
 * 풀이방법
 **/


public class OptionalStartMain2 {
    public static void main(String[] args) {
        String nonNullValue = "Hello World";
        Optional<String> opt1 = Optional.of(nonNullValue);
        System.out.println("opt1 = " + opt1);

        //2. ofNullable() : 값이 null일 수 도 아닐 수도 있을 때
        Optional<String> opt3 = Optional.ofNullable(null);
        System.out.println("opt3 = " + opt3);

        //3.
//        opt3.get();

        //값이 있으면 그 값  없으면 기본값 사용
        System.out.println(" 3. orElse");
        String s = opt1.orElse("기본값");
        System.out.println(s);


        //값이 없을 떄 람다 가 실행되어 기본값 실행

        String empty2 = opt3.orElseGet(() -> {
            System.out.println("람다 호출 - optEmpty");
            return "NEW vLAUE ";
        });
        System.out.println("empty2 = " + empty2);

        // 값이 있으면 반환, ㅇ없으면 예외 발생
        //5. orElseThrow()

        try{
            String s1 = opt3.orElseThrow(() -> new RuntimeException("값이 없습니다"));
            System.out.println(s1);
        }catch(Exception e){
            System.out.println("예외 발생 : " + e.getMessage());
        }


        // 6. Optional 반환
        System.out.println("6. or() ");
        Optional<String> result1 = opt3.or(() -> Optional.of("FeedBack"));
        System.out.println("result1 = " + result1);




    }
}
