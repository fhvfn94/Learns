package com.skyPro.Learns.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private String name;
    private String sureName;
    private String passport;
    private Set<Integer> professionNumbers;

    public Person(String name, String sureName, String passport, int professionNumber) {
        this.name = name;
        this.sureName = sureName;
        this.passport = passport;
        this.professionNumbers = new HashSet<>(List.of(professionNumber));
    }
    public Set<Integer> getProfessionNumber() {
        return professionNumbers;
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
