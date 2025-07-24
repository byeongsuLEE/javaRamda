package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-23
 * 풀이방법
 **/


public class OptionalStarMain1 {
    private static final Map<Long, String> map = new HashMap<>();

    static{
        map.put(1L , "kim");
        map.put(2L , "Seo");
    }
    public static void main(String[] args) {
        findAQndPrint(1L);
        findAQndPrint(3L);
    }

    //이름이 있으면 대문자로 출력,
    //없으면 unkonw 출력
    static void findAQndPrint(Long id){
        Optional<String> nameById = findNameById(id);
        String name = nameById.orElse("UNKOWN");

        System.out.println(id + "name : " + name);

        //1. null point exception
//        System.out.println(name.toUpperCase());

        //2. IF 문을 활용한 NULL 체크
//        if(name != null){
//            System.out.println(name.toUpperCase());
//        }else{
//            System.out.println("UNKNOWN");
//        }
    }

    static Optional<String> findNameById(long id) {

        return Optional.ofNullable(map.get(id));

    }
}
