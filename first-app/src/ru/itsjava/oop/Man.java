package ru.itsjava.oop;

public class Man {

    private String name;
    private int age;


    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println(name + " Hello ");
    }

    public void setName2(String name2) {
        this.name = name2;

    }

    public String getName2(){
        return name;
    }
}
