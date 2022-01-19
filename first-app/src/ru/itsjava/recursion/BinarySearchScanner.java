package ru.itsjava.recursion;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchScanner {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 5, 8, 13, 21};

        Scanner console = new Scanner(System.in);

        System.out.println("Введите число ");
        int num = console.nextInt();

        num = binarySearch(num, 0, array.length, array);

        System.out.println("Позиция в массиве: " + Arrays.toString(array) + " равна " + num);


    }

    public static int binarySearch(int console, int beginIndex, int endIndex, int[] array) {


        int midIndex = beginIndex + (endIndex - beginIndex) / 2;

        if (console == array[midIndex]) return midIndex;

        if (console > array[midIndex]) return binarySearch(console, midIndex + 1, endIndex, array);

        return binarySearch(console, beginIndex, midIndex - 1, array);
    }
}
