package com.skyPro.Learns.example;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        System.out.println(numbers);
        numbers.set(0, 10);
        System.out.println(numbers);
        numbers.add(30);
        System.out.println(numbers);
    }
}
