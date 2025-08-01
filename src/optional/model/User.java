package optional.model;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-24
 * 풀이방법
 **/


public class User {
    private String name;
    private Address address;

    public User(String name, Address address) {

        this.name = name;
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
