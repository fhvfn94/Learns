package com.skyPro.Learns.example;

import com.skyPro.Learns.domain.Driver;
import com.skyPro.Learns.domain.TruckDriver;

public class PolimorphismExample {
    public static void main(String[] args) {
        Driver driver = new TruckDriver(
                "Армат",
                "Куаныш",
                "3",
                "295",
                2);
        driver.setDriverLicenseNumber("123");
        System.out.println("driver.getDriverLicenseNumber() = " + driver.getDriverLicenseNumber());
    }
}
