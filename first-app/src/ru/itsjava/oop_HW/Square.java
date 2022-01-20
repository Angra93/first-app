package ru.itsjava.oop_HW;

public class Square extends Figure {
    private int num1;


    public Square(int num1) {
        this.num1 = num1;

    }

    public void perimert() {
        System.out.println(num1 * 4);
    }

    public void area() {
        System.out.println(num1 * num1);
    }
}
