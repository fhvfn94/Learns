package com.skyPro.Learns.example;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
//        Создаем список из чисел в массиве
        Integer[] numbersArray = {1, 2, 3};
//        Создаем список из чисел в листе
        /*List<Integer> numbersList = List.of(1, 2, 3);*/
        List<Integer> numbersList = new ArrayList<>(List.of(1, 2, 3, 6));

//        распечатаем массив
        System.out.println(Arrays.toString(numbersArray) + " распечатаем массив");
//        распечатаем лист
        System.out.println(numbersList + " распечатаем лист");

//        распечатаем 0 элемент в массиве
        System.out.println("распечатаем 0 элемент в массиве = " + numbersArray[0]);
//        распечатаем 0 элемент в листе
        System.out.println("распечатаем 0 элемент в листе = " + numbersList.get(0));

//        присвоем 1 элементу массива значение 10
        numbersArray[1] = 10;
        System.out.println("распечатаем 1 элемент в массиве = " + numbersArray[1]);
//        присвоем 1 элементу листа значение 10. В set в начале указаывем индекс, потом значение
        numbersList.set(1, 10);
        System.out.println("распечатаем 1 элемент в листе = " + numbersList.get(1));

//        Распечатаем длину массива
        System.out.println("Длина массива numbersArray = " + numbersArray.length);
//        Распечатаем длину листа
        System.out.println("Длина листа numbersList = " + numbersList.size());

//        создаем HashMap
        Map<String, Integer> numbersMap = new HashMap<>();
//        добавляем ключ и зачение в numbersMap
        numbersMap.put("one", 1);
        System.out.println(numbersMap);
    }
}
