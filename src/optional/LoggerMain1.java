package optional;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-24
 * 풀이방법
 **/


public class LoggerMain1 {

    public static void main(String[] args) {

        // 두 계산식이 실행 후 로직이 호출된다.
        // 30 덧셈실행 -> 함수 로직
        // 이것이 문제가 될 수 있다.
        // cpu가 낭비한거다.
        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(10+20);

        System.out.println("디버그 모드 끄기");
        logger.setDebug(false);
        logger.debug(300+100);
    }
}
