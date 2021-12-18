package HW_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWorkFor {
    public static void main(String[] args) {

        int[] numberArray = new int[]{5, 8, 10, 12, 15, 42, 2};
        System.out.println();
//
//        //1. Вывести элементы массива с нечетными индексами. (Индексы 1, 3, 5 и т.д.)
//        for (int i = 1; i < numberArray.length; i += 2) {
//            System.out.print(numberArray[i] + " ");
//        }
//        System.out.println();
//
//        // 2. Вывести первые 4 элемента массива.
//
//        for (int i = 0; i < 4; i++) {
//
//            System.out.print(numberArray[i] + " ");
//
//
//        }
//        System.out.println();
//
//        //3. Вывести последние 4 элемента массива.
//        for (int i = numberArray.length-4; i < numberArray.length; i++) {
//            System.out.print(numberArray[i] + " ");
//       }

        OutputArrayElementsWithOddIndexes(numberArray);
        System.out.println();
        OutputTheFirstFourElementsOfTheArray(numberArray);
        System.out.println();
        OutputTheLastFourElementsOfTheArray(numberArray);


    }

    public static void OutputArrayElementsWithOddIndexes(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");

        }

    }

    public static void OutputTheFirstFourElementsOfTheArray(int[] array) {
        for (int i = 0; i < 4; i++) {
            System.out.print(array[i] + " ");


        }

    }

    public static void OutputTheLastFourElementsOfTheArray(int[] array) {

        for (int i = array.length-4; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
    }
}
