package ru.flamexander.java.basic.homeworks.lesson4;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(int[] array, int initialNumber) {
        for (int i = 0; i < array.length; i++) {
            array[i] = initialNumber;
        }
    }
}
