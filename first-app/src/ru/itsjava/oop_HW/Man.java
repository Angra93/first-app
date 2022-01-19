package ru.itsjava.oop_HW;

public class Man extends Person {

    private String name;
    private int age;

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printAge() {

        System.out.println(age);
    }
    public void printName(){
        System.out.println(name);
    }

}
