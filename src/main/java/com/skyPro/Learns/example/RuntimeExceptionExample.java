package com.skyPro.Learns.example;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        int number = 3;
        if (number != 2) {
            throw new RuntimeException("number is not 2");
        }
    }
}
