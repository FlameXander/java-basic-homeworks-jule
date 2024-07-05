package ru.flamexander.java.basic.homeworks;

public class GreetingsApplication {
    public static void main(String[] args) {
        drawSquare(15);
    }

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("-");
            for (int j = 0; j < size - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("-\n");
        }
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println("\n");
    }
}
