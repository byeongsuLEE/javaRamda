package methodRef.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-28
 * 풀이방법
 **/


public class MethodRef6 {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee")
        );

        List<String> list = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();

        System.out.println("list = " + list);

    }

    public static List<String> mapPersonToString(List<Person> personList , Function<Person, String> fun ){
        List<String> list = new ArrayList<>();
        for(Person person : personList){
            list.add(fun.apply(person));
        }
        return list;


    }
}
