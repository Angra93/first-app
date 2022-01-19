package ru.itsjava.recursion;

public class RecursionPractice {

    public static void main(String[] args) {

        System.out.println("fact(5) = " + fact(5));
//        System.out.println("fact(0) = " + fact(0));
//        System.out.println("fact(1) = " + fact(1));
//
//        System.out.println("fact(-5) = " + fact(-5));
    }

    public static int fact(int num) {
        if (num < 0) {
            // System.err - с помощью него пишуться все, возможные ошибки
            System.err.println("Факториал для числа " + num + " не определен!");
            return -1;
        }
        // Базовый случай
        if ((num == 1) || (num == 0)) return 1;

        // Условия перехода
        return num * fact(num -1);

    }


}
//Факториал числа
// 0! = 1! = 1
// 5! = 5 * 4 * 3 * 2 * 1
// 4! = 4 * 3 * 2 * 1

// 5! = 5 * 4!         - 120
// 4! = 4 * 3!         - 24
// 3! = 3 * 2!         - 6
// 2! = 2 * 1!         - 2
// 1! = 1              - 1
