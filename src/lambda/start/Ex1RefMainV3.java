package lambda.start;

import lambda.Procedure;

/**
 * @작성자   : lb
 * @작성일   : 2025-06-26
 * @설명     : 익명 클래스 참조값을 매개변수에 직접 전달

 */
public class Ex1RefMainV3 {
    static class Dice implements Procedure {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    static class Sum implements Procedure {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        //코드 조각 시작
        procedure.run();

        //코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {


        hello(()-> {
            int random = (int) (Math.random() * 100);
            System.out.println(random);
        });
        hello(()-> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            });
    }
}

