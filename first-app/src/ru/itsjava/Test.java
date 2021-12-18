package ru.itsjava;


public class Test {
    public static void main(String[] args) {

//        int[] array = new int[]{3, 2, -5, 0, 2};
//        System.out.print("Индексы элементов массива равные 2: ");
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 2) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        int countOfTwo = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 2) {
//                countOfTwo++;
//            }
//        }
//        System.out.println("Количество 2 = " + countOfTwo);

        int[] numbers = new int[]{1, 2, 8, 0, 5};
        int max = getMaxValue(numbers);
        System.out.println("Максимальное значение: " + max);
    }

    private static int getMaxValue(int[] array) {
        int maxElem = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElem) {
                maxElem = array[i];
            }
        }
        return maxElem;
    }
}
