package methodRef.ex;

import java.util.function.Supplier;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-28
 * 풀이방법
 **/


public class MethodRefEx1 {
    public static void main(String[] args) {
        //1 정적 메서드 참조
        Supplier<String > supplier = Person::greeting;
        System.out.println(supplier.get());


        //2 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Supplier <String> supplier1 = () -> person.introduce();
        System.out.println(supplier1.get());
        supplier1 = person::introduce;
        System.out.println();

        // 3. 생성자 참조

        Supplier<Person> supplier2 = () -> new Person();
        Supplier<Person> supplier3 =  Person::new;
        System.out.println("supplier2 = " + supplier2);
        System.out.println("supplier3 = " + supplier3);

    }
}
