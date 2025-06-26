package lambda.lamabda1;

import lambda.Procedure;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-26
 * 풀이방법
 **/


public class ProcedureMain1 {
    public static void main(String[] args) {
        Procedure procedure = () -> {
            System.out.println("Hello World");
        };

        procedure.run();
    }
}
