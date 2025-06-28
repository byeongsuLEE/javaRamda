package methodRef.ex;

import java.util.function.Function;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-28
 * 풀이방법
 **/


public class MethodRef4 {
    public static void main(String[] args) {
        // 4. 임의 객체의 인스턴스 메서드 참조 (특정 타입의)
        Person person1 = new Person("Kim");
        Person person2 = new Person("Park");
        Person person3 = new Person("Lee");


        //람다
        Function<Person, String> fun1 = (Person person) -> person.introduce();
        System.out.println("person1.introduce = "  + fun1.apply(person1));
        System.out.println("person2.introduce = "  + fun1.apply(person2));
        System.out.println("person3.introduce = "  + fun1.apply(person3));

        //메서드 참조, 타입이 첫번째 매개변수가 됨
        // 첫 번째 매개변수의 메서드를 호출, 나머지는 순서대로 매개변수에 전달
        Function<Person, String> fun2 = Person::introduce; // 클래스명 :: 임의객체의 참조 메서드
        System.out.println("person1.introduce = "  + fun2.apply(person1));
        System.out.println("person2.introduce = "  + fun2.apply(person2));
        System.out.println("person3.introduce = "  + fun2.apply(person3));
    }
}
