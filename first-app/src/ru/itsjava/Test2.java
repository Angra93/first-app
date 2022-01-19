package ru.itsjava;

public class Test2 {
    public static void main(String[] args) {

        System.out.println("factorial(5) = " + factorial(5));

    }

    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
}
