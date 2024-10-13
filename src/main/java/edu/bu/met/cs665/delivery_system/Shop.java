/**
 * File Name: Shop.java
 * Description: This class represents a shop that creates delivery requests and notifies registered drivers
 * using the Observer pattern. It implements the DeliveryNotifier interface to add, remove, and
 * notify drivers of new delivery requests.
 */

package edu.bu.met.cs665.delivery_system;

import java.util.ArrayList;
import java.util.List;

public class Shop implements DeliveryNotifier {
    private String name;
    private List<DriverObserver> drivers;

    public Shop(String name) {
        this.name = name;
        this.drivers = new ArrayList<>();
    }

    @Override
    public void addDriver(DriverObserver driver) {
        drivers.add(driver);
    }

    @Override
    public void removeDriver(DriverObserver driver) {
        drivers.remove(driver);
    }

    @Override
    public void notifyDrivers(DeliveryRequest deliveryRequest) {
        for (DriverObserver driver : drivers) {
            driver.update(deliveryRequest);
        }
    }

    public void createDeliveryRequest(String orderDetails) {
        DeliveryRequest deliveryRequest = new DeliveryRequest(name, orderDetails);
        notifyDrivers(deliveryRequest);
    }

    // Getter for drivers
    public List<DriverObserver> getDrivers() {
        return drivers;
    }
}
