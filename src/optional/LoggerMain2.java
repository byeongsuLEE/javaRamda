package optional;

import java.util.Optional;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-24
 * 풀이방법
 **/


public class LoggerMain2 {

    public static void main(String[] args) {

        // 두 계산식이 실행 후 로직이 호출된다.
        // 30 덧셈실행 -> 함수 로직
        // 이것이 문제가 될 수 있다.
        // cpu가 낭비한거다.
        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(value100() + value200());

        System.out.println("디버그 모드 끄기");
        logger.setDebug(false);
        logger.debug(value100() + value200());

        //위의 코드 연산 제거 한 버전
        //이 코드는 코드가 너무 길다. 한줄로 줄일 수 있을 까?
        if(logger.isDebug()){
            logger.debug(value100() + value200());
        }

        //람다를 사용해서 연산을 정의하는 시점과 실행하는 시점을 분리해서 문제를 해결해보자.


        Optional.of(logger.isDebug()).isPresent();
    }

    static int value100(){
        System.out.println("value100 호출 ");
        return 100;
    }

    static int value200(){
        System.out.println("value200 호출");
        return 200;
    }
}
