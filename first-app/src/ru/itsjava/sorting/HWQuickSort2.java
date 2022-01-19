package ru.itsjava.sorting;

import java.util.Arrays;

public class HWQuickSort2 {
    public static void main(String[] args) {

        int[] array = new int[]{1000, 5, 7, 3, 2, 500, 13, 19, -5};

        quicksort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    private static void quicksort(int[] array, int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        // Опорный элемент
        int pivot = array[(leftBorder + rightBorder) / 2];

        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quicksort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quicksort(array, leftBorder, rightMarker);
        }
    }
}
