package optional.model;

/**
 * 작성자  : lbs
 * 날짜    : 2025-07-26
 * 풀이방법
 **/


public class Delivery {
    private String status;
    private boolean canceled;

    public Delivery(String status, boolean canceled) {
        this.status = status;
        this.canceled = canceled;
    }

    public String getStatus() {
        return status;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
