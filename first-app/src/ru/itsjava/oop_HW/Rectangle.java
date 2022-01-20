package ru.itsjava.oop_HW;

public class Rectangle extends Figure {
    private int num1;
    private int num2;


    public Rectangle(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public void perimert() {
        System.out.println((num1 + num2) * 2);
    }

    public void area(){
        System.out.println(num1 * num2);
    }
}
