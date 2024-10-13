/**
 * File Name: Driver.java
 * Description: This class represents a driver in the delivery system who receives notifications
 * about new delivery requests. The Driver class implements the DriverObserver interface
 * to receive updates when a new delivery request is created.
 */

package edu.bu.met.cs665.delivery_system;

import java.util.ArrayList;
import java.util.List;

public class Driver implements DriverObserver {
    private String name;
    private List<DeliveryRequest> receivedRequests;

    public Driver(String name) {
        this.name = name;
        this.receivedRequests = new ArrayList<>();
    }

    @Override
    public void update(DeliveryRequest deliveryRequest) {
        receivedRequests.add(deliveryRequest);
        System.out.println("Driver " + name + " received delivery request: " + deliveryRequest);
    }

    public List<DeliveryRequest> getReceivedRequests() {
        return receivedRequests;
    }
}
