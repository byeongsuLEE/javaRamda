package optional.model;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-26
 * 풀이방법
 **/


public class Order {
    private Long id;
    private Delivery delivery;

    public Order(Long id, Delivery delivery) {
        this.id = id;
        this.delivery = delivery;
    }

    public Long getId() {

        return id;
    }

    public Delivery getDelivery() {
        return delivery;
    }
}
