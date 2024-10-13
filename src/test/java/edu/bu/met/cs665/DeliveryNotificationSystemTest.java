/**
 * File Name: DeliveryNotificationSystemTest.java
 * Description: This class contains unit tests for the delivery notification system,
 * specifically testing the functionality of driver registration, notification,
 * and removal within a shop.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.delivery_system.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeliveryNotificationSystemTest {

    @Test
    public void testDriverRegistrationAndNotification() {

        Shop shop = new Shop("Pizza Palace");
        Driver driver1 = new Driver("John");
        Driver driver2 = new Driver("Jane");

        shop.addDriver(driver1);
        shop.addDriver(driver2);

        String orderDetails = "Large pepperoni pizza";
        shop.createDeliveryRequest(orderDetails);

        assertEquals("Shop should have two registered drivers", 2, shop.getDrivers().size());
        assertTrue("Driver 1 should be notified about the order", driver1.getReceivedRequests().get(0).toString().contains(orderDetails));
        assertTrue("Driver 2 should be notified about the order", driver2.getReceivedRequests().get(0).toString().contains(orderDetails));
    }

    @Test
    public void testDriverRemoval() {

        Shop shop = new Shop("Coffee Shop");
        Driver driver1 = new Driver("Alice");
        Driver driver2 = new Driver("Bob");

        shop.addDriver(driver1);
        shop.addDriver(driver2);

        shop.removeDriver(driver1);

        String orderDetails = "Latte and croissant";
        shop.createDeliveryRequest(orderDetails);

        assertEquals("Shop should have one driver remaining", 1, shop.getDrivers().size());
        assertFalse("Removed driver shouldn't receive notifications", driver1.getReceivedRequests().stream().anyMatch(request -> request.toString().contains(orderDetails)));
        assertTrue("Remaining driver should be notified", driver2.getReceivedRequests().get(0).toString().contains(orderDetails));
    }

    @Test
    public void testEmptyDriverListNotification() {
        Shop shop = new Shop("Grocery Store");

        // No drivers are registered initially
        String orderDetails = "Bag of groceries";
        shop.createDeliveryRequest(orderDetails);

        assertEquals("Shop should have no registered drivers", 0, shop.getDrivers().size());

    }
}
