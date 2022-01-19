package ru.itsjava.hw_1;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Я люблю домашние задания");

        short num1 = 10;
        short num2 = 7;
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println(num1 / num2);
//        System.out.println(num1 % num2);
//
//        num1++;
//        System.out.println(num1);
//        num2--;
//        System.out.println(num2);
//
//        System.out.println(5 > 7);
//        System.out.println(5 < 7);
//        System.out.println(5 >= 7);
//        System.out.println(5 <= 7);
//        System.out.println(5 == 7);
//        System.out.println(5 != 7);
        System.out.println("printNumb(num1 + num2) = " + printNumb(num1, num2));
        System.out.println("printNumb2(num1 - num2) = " + printNumb2(num1, num2));
        System.out.println("printNumb3(num1 * num2) = " + printNumb3(num1, num2));
    }

    public static int printNumb(short num1, short num2) {
        return num1 + num2;


    }

    public static int printNumb2(short num1, short num2) {
        return num1 - num2;

    }


    public static int printNumb3(short num1, short num2) {
        return num1 * num2;
    }
}