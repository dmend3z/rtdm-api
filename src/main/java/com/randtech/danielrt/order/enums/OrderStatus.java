package com.randtech.danielrt.order.enums;


public enum OrderStatus {

    WAITING_FOR_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELLED(5);


    private int status;

    private int getStatus() {
        return status;
    }

    private OrderStatus(int status) {
        this.status = status;
    }

 
    public static OrderStatus getOrderStatus(int status) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getStatus() == status) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Invalid Status");
    }

}
