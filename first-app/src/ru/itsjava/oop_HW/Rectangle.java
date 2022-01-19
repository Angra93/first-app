package ru.itsjava.oop_HW;

public class Rectangle extends Figure {
    private int num1;
    private int num2;
    private int num3;
    private int num4;

    public Rectangle(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public void printRectangle() {
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
    }

}
