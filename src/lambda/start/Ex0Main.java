package lambda.start;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-26
 * 풀이방법
 **/


public class Ex0Main {
    public static StringBuilder sb = new StringBuilder();
    public static void hello(String message){
        sb.append("프로그램 시작").append("\n");
        sb.append("Hello "+ message).append("\n");
        sb.append("프로그램 종료").append("\n");
    }
    public static void main(String[] args) {
        hello("java");
        hello("Spring");
        System.out.println(sb.toString());
    }
}
