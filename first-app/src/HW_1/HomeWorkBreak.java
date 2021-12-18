package HW_1;

import java.util.Arrays;

public class HomeWorkBreak {
    public static void main(String[] args) {
        int[] numbersArray = new int[]{5, -8, 10, 0, -12, 15};
        int search = 0;
//
//        //  1. Найти минимальный элемент массива
//        int num = numbersArray[0];
//        for (int i = 0; i < numbersArray.length; i++) {
//            if (numbersArray[i] < num) {
//                num = numbersArray[i];
//            }
//        }
//        System.out.println(num);
//
//        //2.Вывести элементы массива, делящиеся на 5
//
//        for (int i = 0; i < numbersArray.length; i++) {
//            if (numbersArray[i] % 5 == 0 && numbersArray[i] != 0)
//
//                System.out.print(numbersArray[i] + " ");
//        }
//
//        System.out.println();
//
//        //3. Найти сумму элементов массива с четными индексами
//
//        int count = 0;
//
//        for (int i = 0; i < numbersArray.length; i += 2) {
//
//            count = (numbersArray[i] + count);
//        }
//        System.out.print(count);
//        System.out.print(" (5 + 10 - 12) ");
//
//
//        System.out.println();
//        //4. Найти первый элемент массива, делящийся на 5
//
//        for (int i = 0; i < numbersArray.length; i++) {
//            if (numbersArray[i] % 5 == 0 && numbersArray[i] != 0)
//
//                System.out.print(numbersArray[i] + " ");
//            break;
//        }
//
//        System.out.println();

        searchMinElem(numbersArray);
        System.out.println("Минимальный элемент: " + searchMinElem(numbersArray));
        getElemDivision(numbersArray);
        System.out.println("Элементы массива делящиеся на 5 = " + getElemDivision(numbersArray));

        searchMinElem(numbersArray);
        System.out.println(Arrays.toString(numbersArray));

        search = searchSamElem(numbersArray);
        System.out.println(search);


    }

    //  1. Найти минимальный элемент массива
    public static int searchMinElem(int[] array) {
        int minElem = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElem) {
                minElem = array[i];
            }
        }
        return minElem;
    }

    //2.Вывести элементы массива, делящиеся на 5
    public static int getElemDivision(int[] array) {
        int five = array[0];  //Как возвратить остальное? у меня не получается ='(

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] != 0) {
                array[i] = five;
            }
        }
        return five;
    }

    //3. Найти сумму элементов массива с четными индексами
    public static int searchSamElem(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i += 2) {
            count = (array[i] + count);

        }
        return count;
    }
                   // Я правильно делаю задание?
}



