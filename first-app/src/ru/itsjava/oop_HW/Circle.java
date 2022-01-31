package ru.itsjava.oop_HW;

public class Circle extends Figure{
    private static int num1;


    public Circle(int num1) {
        this.num1 = num1;
    }

    public void area() {
        System.out.println(Math.PI * (num1 * num1));
    }


}
