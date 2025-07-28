package optional;

import optional.model.Address;
import optional.model.User;

import java.util.Optional;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-24
 * 풀이방법
 **/


public class AddressMain1 {
    public static void main(String[] args) {

        User user1 = new User("user", null);
        User user2 = new User("user2", new Address("hello street"));

        printStreet(user1);
        printStreet(user2);
    }

    private static void printStreet(User user) {
        Optional<String>  userStreet = getUserStreet(user);

        userStreet.ifPresentOrElse(System.out::println, ()-> System.out.println("user not found "));
//
//        if(userStreet != null) {
//            System.out.println(userStreet);
//        }else{
//            System.out.println("User not found");
//        }
    }
    static Optional<String>  getUserStreet(User user){


        return Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getStreet);

//      refactoring 전 코드
//        if(user ==null){
//            return null;
//        }
//
//        Address address = user.getAddress();
//        if(address == null){
//            return null;
//        }
//
//        return address.getStreet();

    }

}
