package ru.itsjava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        System.out.println("If practice");

        Scanner console = new Scanner(System.in);

        System.out.println("Введите целое число");
        int numFromConsole = console.nextInt();

        System.out.println("Начало");
        if (numFromConsole > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число меньше или равно 5");
        }
        System.out.println("Конец");
    }
}
