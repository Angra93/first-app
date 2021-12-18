package HW_1;


import java.util.Scanner;

public class HWScanner {
    public static void main(String[] args) {
        // Scanner console = new Scanner(System.in);

        //1. С консоли считывается 2 числа. Найти максимум из двух чисел
        /*System.out.println("Введите 2 числа");
        int num1 = console.nextInt();
        int num2 = console.nextInt();

        if (num1 > num2) {
            System.out.println("num1 > num2");
        } else {
            System.out.println("num2 > num1");
        }*/

        // 2. С консоли считывается 3 числа. Найти минимум из трех чисел
        /*System.out.println("Введите 3 числа");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1);
        } else if (num2 < num1 && num2 <= num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }*/

        //3. Программа призывник:
       /* System.out.println("Ведите возраст молодого человека");
        int age = console.nextInt();

        if (age < 0 || age > 100) {
            System.out.println("возраст некорректен");
        } else if (age <= 17) {
            System.out.println("еще слишком мал");
        } else if ((age >= 18) && (age <= 27)) {
            System.out.println("служи");
        } else {
            System.out.println("уже слишком поздно");
        }*/

        // 5. Поменять значения двух переменных местами.
       /* int num1 = 3;
        int num2 = 5;
        int a = num1;

        num1 = num2;
        num2 = a;

        System.out.println(num1);
        System.out.println(num2);
        */

        //6. С консоли считываем коэффициенты квадратного уравнения.
/*
        System.out.print("Введите значение a, b, c");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }*/

        Scanner console = new Scanner(System.in);
        twoNumbersAreReadFromTheConsoleFindTheMaximumOfTwoNumbers(console);
        threeNumbersAreReadFromTheConsoleFindTheMinimumOfThreeNumbers(console);
        theConscriptProgram(console);
        swapTheValuesOfTwoVariables();
        fromTheConsoleWeReadTheCoefficientsOfTheQuadraticQquation(console);
    }

    public static void twoNumbersAreReadFromTheConsoleFindTheMaximumOfTwoNumbers(Scanner console) {
//        System.out.println("Введите 2 числа");
//        int numb1 = console.nextInt();
//        int numb2 = console.nextInt();
//
//        if (numb1 > numb2) {
//            System.out.println("numb1 > num2");
//        } else {
//            System.out.println("numb2 > num1");
//        }
    }

    public static void threeNumbersAreReadFromTheConsoleFindTheMinimumOfThreeNumbers(Scanner console) {
//        System.out.println("Введите 3 числа");
//        int num1 = console.nextInt();
//        int num2 = console.nextInt();
//        int num3 = console.nextInt();
//
//        if (num1 <= num2 && num1 <= num3) {
//            System.out.println(num1);
//        } else if (num2 < num1 && num2 <= num3) {
//            System.out.println(num2);
//        } else {
//            System.out.println(num3);
//        }
    }

    public static void theConscriptProgram(Scanner console) {
//        System.out.println("Ведите возраст молодого человека");
//        int age = console.nextInt();
//
//        if (age < 0 || age > 100) {
//            System.out.println("возраст некорректен");
//        } else if (age <= 17) {
//            System.out.println("еще слишком мал");
//        } else if ((age >= 18) && (age <= 27)) {
//            System.out.println("служи");
//        } else {
//            System.out.println("уже слишком поздно");
//        }
    }

    public static void swapTheValuesOfTwoVariables() {
//        int num1 = 3;
//        int num2 = 5;
//        int a = num1;
//
//        num1 = num2;
//        num2 = a;
//
//        System.out.println(num1);
//        System.out.println(num2);

    }

    public static void fromTheConsoleWeReadTheCoefficientsOfTheQuadraticQquation(Scanner console) {
        System.out.print("Введите значение a, b, c");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}