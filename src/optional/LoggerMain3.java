package optional;

import java.util.Optional;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-24
 * 풀이방법
 **/


public class LoggerMain3 {

    public static void main(String[] args) {

       // 지연 평가로 적용!! 람다를 이용하면 된다.
        //연산을 정의하는 시점과 실행하는 시점을 분리해보자.
        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(()-> value100() + value200());

        System.out.println("디버그 모드 끄기");
        logger.setDebug(false);
        logger.debug(()-> value100() + value200());

//        if(logger.isDebug()){
//            logger.debug(value100() + value200());
//        }



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
