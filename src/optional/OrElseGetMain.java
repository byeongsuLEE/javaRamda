package optional;

import java.util.Optional;
import java.util.Random;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-24
 * 풀이방법
 **/


public class OrElseGetMain {
    public static void main(String[] args) {
        Optional<Integer> optVlaue = Optional.of(100);
        Optional<Integer> optEmpty = Optional.empty();

        System.out.println("단순 계싼");
        Integer i1 = optVlaue.orElse(10 + 20);
        Integer i2 = optVlaue.orElse(10 + 20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        System.out.println("orELse ===");
        System.out.println("값이 있는 경우");
        Integer i = optVlaue.orElseGet(()-> createData());
        System.out.println("value 1 = " + i);


        System.out.println("값이 없는 경우");
        Integer i3 = optEmpty.orElseGet(()-> createData());
        System.out.println("value 2 = " + i3);


    }

    static int createData (){
        System.out.println("데이터를 생성합니다.");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int createValue  = new Random().nextInt(100);
        System.out.println("데이터 생성이 완료 되었습니다. 생성값 : "  + createValue);
        return createValue;
    }

}
