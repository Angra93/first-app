package ru.itsjava.hw_1;

import java.util.Arrays;

public class HWFibonacciNumbers {

    public static void main(String[] args) {

        int[] arr = new int[10];


//        arr[0] = 0;
//        arr[1] = 1;
//
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//       }

        // fibonacci(arr);
        // System.out.println("fibonacci(arr) = " + Arrays.toString(arr));
        System.out.println("fibonacci(arr) = " + Arrays.toString(arr));

        System.out.println("fibonacci2(5) = " + fibonacci2(5));

    }

//    public static int fibonacci(int[] arr) {
//
//        arr[0] = 0;
//        arr[1] = 1;
//
//
//        for (int i = 2; i < arr.length; i++)
//            arr[i] = arr[i - 1] + arr[i - 2];
//
//        if ((arr[1] == 1) || (arr[0] == 0))
//            return 1;
//
//            return fibonacci(arr);
//
//       }

    public static int fibonacci2(int arr) {


        if ((arr == 1) || (arr == 0))
            return 1;


        return fibonacci2(arr - 1) + fibonacci2(arr - 2);
    }

}
