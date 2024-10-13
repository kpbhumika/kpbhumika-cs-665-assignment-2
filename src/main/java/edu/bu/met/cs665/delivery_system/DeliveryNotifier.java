/**
 * File Name: DeliveryNotifier.java
 * Description: This interface defines the contract for classes that can notify drivers
 * of new delivery requests. It provides methods to add, remove, and notify drivers.
 */

package edu.bu.met.cs665.delivery_system;

public interface DeliveryNotifier {
    void addDriver(DriverObserver driver);
    void removeDriver(DriverObserver driver);
    void notifyDrivers(DeliveryRequest deliveryRequest);
}
