package HW_1;

public class HomeWorkMehods {
    public static void main(String[] args) {

        //1.  Написать метод по вычислению минимума из двух чисел.
        printMinValue(5, 10);
        printEqually(5, 5);
    }

    public static void printMinValue(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Минимум: " + num2);
        } else {
            System.out.println("Минимум: " + num1);
        }


        System.out.println("getMinValue(3, 10) = " + getMinValue(3, 10));
    }
    //2. Написать метод, который печатает минимум из двух чисел.

    public static int getMinValue(int num1, int num2) {
        if (num1 > num2) return num2;

        return num1;


    }

    //3. Написать метод, который печатает равны или не равны два числа
    public static void printEqually(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Числа равны ");
        } else {
            System.out.println("Числа не равны ");
        }
    }
}
