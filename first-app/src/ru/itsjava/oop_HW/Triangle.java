package ru.itsjava.oop_HW;

public class Triangle extends Figure {
    private int num1;
    private int num2;
    private int num3;

    public Triangle(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void perimert() {
        System.out.println(num1 + num2 + num3);
    }

    public void area() {
        float p = (num1 + num2 + num3) / 2F;

        System.out.println(Math.sqrt(p * (p - num1) * (p - num2) * (p - num3)));
    }
}
