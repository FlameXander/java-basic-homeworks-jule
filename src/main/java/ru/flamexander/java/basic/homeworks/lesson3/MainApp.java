package ru.flamexander.java.basic.homeworks.lesson3;

public class MainApp {
    // Домашнее задание:
    // - Реализуйте метод printIsNumberPositive, он должен напечатать в консоль
    // сообщение number + " - число положительно" если передано не отрицательное число

    public static void main(String[] args) {
        printIsNumberPositive(10);
        printIsNumberPositive(-10);
    }

    public static void printIsNumberPositive(int number) {
        if (number >= 0) {
            System.out.println(number + " - число положительно");
        }
    }
}
