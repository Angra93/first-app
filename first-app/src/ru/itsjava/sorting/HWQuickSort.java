package ru.itsjava.sorting;

import java.util.Arrays;

public class HWQuickSort {
    public static void main(String[] args) {

        int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println("Было: ");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;
        quckSort(x, low, high);
        System.out.println("Стало: ");
        System.out.println(Arrays.toString(x));


    }

    private static void quckSort(int[] array, int low, int high) {
        if (array.length == 0) return; //завершить выполнение если длина массива равна 0

        if (low >= high) return; //завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) { //меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quckSort(array, low, j);
        if (high > i)
            quckSort(array, i, high);

    }
}
