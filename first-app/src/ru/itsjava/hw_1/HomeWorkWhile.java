package ru.itsjava.hw_1;


public class HomeWorkWhile {
    public static void main(String[] args) {
        //1. Используя цикл while, вывести 10 раз: "Я люблю Java!".
//        int a = 0;
//        while (a < 10) {
//            System.out.println("Я люблю Java");
//            a++;
//        }

        //int[] numbers = new int[]{-3, 0, 5, 4, 12};

        //2. Вывести третий и пятый элементы массива.
        // System.out.println(numbers[2] + " " + numbers[4]);

        //3. Вывести длину массива
        //System.out.println(numbers.length);

        //4.Используя цикл for, вывести 3 раза "Я люблю писать программы на Java!".
        /*for (int i = 0; i < 3; i++) {
            System.out.println("Я люблю писать программы на Java!");
        }    */

        //5. Вывести массив в таком виде: "Массив: { 3, 5, 0, 4, -1}".
//        int[] array = new int[]{3, 5, 0, 4, -1};
//
//        System.out.print("Массив:" + "{");
//        for (int i = 0; i < array.length - 1; i++) {
//
//            System.out.print(array[i] + ", ");
//        }
//        System.out.print(array[array.length - 1]);
//        System.out.println("}");

        int[] array = new int[]{3, 5, 0, 4, -1};
        printTenTimesILoveJava();
        System.out.println();
        OutputTheThirdAndFifthElementsOfTheArray(array);
        OutputTheLengthOfTheArray(array);
        printThreeTimesILikeToWriteProgramsInJava();
        OutputAnArrayInThisFormArray(array);
        System.out.println();
    }

    public static void printTenTimesILoveJava() {
        int iLove = 1;
        while (iLove <= 10) {
            System.out.println("iLove " + iLove);
            iLove++;
        }

    }

    public static void OutputTheThirdAndFifthElementsOfTheArray(int[] array) {
        System.out.println(array[2] + " " + array[4]);
    }

    public static void OutputTheLengthOfTheArray(int[] array) {
        System.out.println(array.length);
    }

    public static void printThreeTimesILikeToWriteProgramsInJava() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Я люблю писать программы на Java!");
        }
    }

    public static void OutputAnArrayInThisFormArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");

        }
        System.out.print(array[array.length-1]);
        System.out.print("}");
    }

}
