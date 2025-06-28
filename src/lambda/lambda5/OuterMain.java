package lambda.lambda5;

import java.sql.SQLOutput;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-28
 * 풀이방법
 **/


public class OuterMain {

    public void excute(){

        Runnable runable  = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스에서의 this.getclass() = " +  this.getClass());
                System.out.println("익명 클래스에서의 this = " +  this);
            };
        };

        //익명 클래스


        Runnable run  = ()-> {
            System.out.println("람다 클래스에서의 this.getclass() = " + this);
            System.out.println("람다 클래스에서의 this = " + this.getClass());
        };


        runable.run();
        System.out.println("---------------------");
        run.run();
    }
    public static void main(String[] args) {

        OuterMain outerMain = new OuterMain();
        System.out.println("기본 클래스 this.getClass() = " +  outerMain.getClass());
        System.out.println("기본 클래스 this = " +  outerMain);
        System.out.println("-------");
        outerMain.excute();

        System.out.println("----");
        OuterMain outerMain2 = new OuterMain();
        outerMain2.excute();

        System.out.println("---");



    }
}
