package com.skyPro.Learns.domain;

public class TruckDriver extends Driver {

    public TruckDriver(String name, String sureName, String passport, String driverLicenseNumber, int professionNumber) {
        super(name, sureName, passport, driverLicenseNumber, professionNumber);
    }

    // метод который присваивает номер водительского удостверения для грузовиков, должен начинаться с 2
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        if (driverLicenseNumber != null && driverLicenseNumber.startsWith("2")) {
            super.setDriverLicenseNumber(driverLicenseNumber);
        }
    }
}
