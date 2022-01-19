package ru.itsjava.oop_HW;

public class Main {
    public static void main(String[] args) {


        Person age = new Person();

        Person man = new Man("Angra", 29);

        man.printAge();

        Person woman = new Woman("Sveta", 18);
        Person woma = new Woman("Anna");

//        woman.name = "Sveta";
//        System.out.println(woman.name);


        Person[] array = new Person[]{man, woman, woma, age};
        for (int i = 0; i < array.length; i++) {
            array[i].printName();
        }

        Figure figure = new Figure();
        figure.printNumber();

        Triangle triangle = new Triangle(5, 5, 4);
        triangle.printTriangle();

        Rectangle rectangle = new Rectangle(2, 5, 5, 2);
        rectangle.printRectangle();

        Square square = new Square(5, 5, 5, 5);
        square.printSquare();
    }
}
