/**
 * File Name: DeliveryRequest.java
 * Description: This class represents a delivery request containing order information.
 * It holds the details of the shop that created the order and a description
 * of the order itself, making it accessible for drivers in the notification system.
 */


package edu.bu.met.cs665.delivery_system;
public class DeliveryRequest {
    private String shopName;
    private String orderDetails;

    public DeliveryRequest(String shopName, String orderDetails) {
        this.shopName = shopName;
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "From " + shopName + ": " + orderDetails;
    }
}
