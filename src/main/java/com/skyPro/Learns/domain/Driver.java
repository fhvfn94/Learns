package com.skyPro.Learns.domain;

public class Driver extends Person {
    private String driverLicenseNumber; // Номер водительского удостоверения

    public Driver(String name, String sureName, String passport, String driverLicenseNumber, int professionNumber) {
        super(name, sureName, passport, professionNumber);
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
}
