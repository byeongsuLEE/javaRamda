package methodRef.ex;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-28
 * 풀이방법
 **/


public class Person {
    private String name;

    public Person(){
        this("unknown");
    }
    public Person(String name) {
        this.name = name;
    }
    public static String greeting(){
        return "Hello";
    }public static String greetingWithName(String name){
        return "Hello" + name;
    }

    public String getName(){
        return name;
    }

    public String introduce(){
        return "I am " + name;
    }   public String introduceWithNumber(int number){
        return "I am " + name + number;
    }
}
