package lambda.lamabda1;

import lambda.MyFunction;
import lambda.Procedure;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-26
 * 풀이방법
 **/


public class InstanceMain {
    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        };
        System.out.println("class.class = " + procedure.getClass());
        System.out.println("class.instance = " + procedure);
        Procedure procedure1 = ()->{
                System.out.println("hello lambda");
            };
        System.out.println("class.class = " + procedure1.getClass());
        System.out.println("class.instance = " + procedure1);
    }
}