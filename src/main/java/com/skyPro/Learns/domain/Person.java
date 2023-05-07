package com.skyPro.Learns.domain;

public class Person {
    private String name;
    private String sureName;
    private String passport;

    public int getProfessionNumber() {
        return professionNumber;
    }

    private int professionNumber;
    public Person(String name, String sureName, String passport, int professionNumber) {
        this.name = name;
        this.sureName = sureName;
        this.passport = passport;
        this.professionNumber = professionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    //    метод что бы изменить номер паспорта
    public void changeNumberPassport(String passport) {
        if (passport != null && !passport.isBlank() && !passport.isEmpty()) {
            this.passport = passport;
        }
    }
}
