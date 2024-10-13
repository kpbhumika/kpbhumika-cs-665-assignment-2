/**
 * Name: BHUMIKA KUSUGOLLI PARAMESWARA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/D31/2024
 * File Name: Main.java
 * Description: This class demonstrates the usage of the Delivery Notification System, where a Shop
 * notifies multiple Drivers of new delivery requests. The Main class is used to set up the system,
 * register drivers, and create sample delivery requests to illustrate the Observer design pattern.
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.delivery_system.*;

public class Main {
  public static void main(String[] args) {
    // Create shop and drivers
    Shop shop = new Shop("Best Buy");
    Driver driver1 = new Driver("James");
    Driver driver2 = new Driver("Michael");
    Driver driver3 = new Driver("Sarah");
    Driver driver4 = new Driver("Jessica");
    Driver driver5 = new Driver("David");

    // Register drivers to the shop
    shop.addDriver(driver1);
    shop.addDriver(driver2);
    shop.addDriver(driver3);
    shop.addDriver(driver4);
    shop.addDriver(driver5);

    // Create a delivery request and notify all drivers
    shop.createDeliveryRequest("Order #1234: Laptop");
  }

}
