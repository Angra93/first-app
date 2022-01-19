package ru.itsjava.oop_HW;

public class Woman extends Person {

    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Woman(String name) {
        this.name = name;
    }

    public void printAge() {
        System.out.println("Всегда 18");
    }
    public void printName(){
        System.out.println(name);
    }

}
