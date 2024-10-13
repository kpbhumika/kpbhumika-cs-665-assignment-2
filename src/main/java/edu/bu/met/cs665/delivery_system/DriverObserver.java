/**
 * File Name: DriverObserver.java
 * Description: This interface defines the contract for driver observers who want to receive
 * delivery notifications. Classes implementing this interface will be notified
 * of new delivery requests.
 */

package edu.bu.met.cs665.delivery_system;

public interface DriverObserver {
    void update(DeliveryRequest deliveryRequest);
}
