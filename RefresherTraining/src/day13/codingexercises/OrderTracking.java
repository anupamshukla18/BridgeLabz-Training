package day13.codingexercises;
enum OrderStatus {

    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    public boolean isFinal() {
        return this == DELIVERED || this == CANCELLED;
    }
}

public class OrderTracking {

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.SHIPPED;

        System.out.println("Order Status: " + status);

        if (status.isFinal()) {
            System.out.println("Order tracking completed.");
        } else {
            System.out.println("Order is still in progress.");
        }
    }
}