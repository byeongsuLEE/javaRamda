package lambda.lambda2;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return str -> greeting + " " +  str; // 적절한 람다 반환
    }

    public static void main(String[] args) {
        // 코드 작성

        StringFunction hello = buildGreeter("Hello");
        StringFunction hi = buildGreeter("Hi");

        String java = hello.apply("java");
        String lambda = hi.apply("Lambda");
        System.out.println(java);
        System.out.println(lambda);


    }
}