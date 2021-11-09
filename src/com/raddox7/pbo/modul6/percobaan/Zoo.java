package com.raddox7.pbo.modul6.percobaan;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Animal("Leon");
        Animal unknown = new Animal();
        Bird eagle = new Bird("Eagle", 5);
        Cat cat = new Cat("Miyu", 3, "Orange");

        cat.walk();
        eagle.walk();
    }
}
