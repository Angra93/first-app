package ru.itsjava;

public class CyclesPractice {
    public static void main(String[] args) {
        // int count = 0;

//       while (count < 3) {
//            System.out.println("Java это классно)");
//            count++;
//        }

//        while (true) {
//            System.out.println("Infinity cycle");
//        }
        // 0  1  2  3
        /*int[] numbers = new int[]{-3, 0, 5, 4};

        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

        System.out.println("Длина массива = " + numbers.length+"\n");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();*/

        int[] numbersArray = new int[]{1, -4, 5, 0, 5};
/*
        System.out.println();
        for (int i = 0; i < numbersArray.length; i += 2) {

            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();
*/
        //Задача: Вывести индексы массива равных 5
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] == 5) {
                System.out.println("Индекс элемента равному 5: " + i);
            }
        }
        int countOfFive = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] == 5) {
                countOfFive++;
            }
        }
        System.out.println("Количество 5 внутри массива: " + countOfFive);

//
//        for (int i = 0; i < numbersArray.length; i++) {
//            if (numbersArray[i] == 5) {
//                System.out.println("Индекс первой пятерки: " + i);
//                break;
//            }
//        }
        int fiveCount = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] == 5) {
                fiveCount++;
                if (fiveCount > 2){
                    break;
                }
                System.out.println("Индексы первых двух пятерок: " + i);

            }
        }

        int[] array = new int[]{3, 2, -5, 0, 2};
        System.out.print("Выводит все элементы индекса НЕ равным 2: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                continue; //продолжить
            }
            System.out.print(i + " ");
        }
    }
}
