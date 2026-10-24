package com.oraclejava.day3.practice;

import com.oraclejava.day3.practice.inheritance.Cat;
import com.oraclejava.day3.practice.inheritance.Dog;

public class B_InheritanceAndPolymorphism {
    public void practice1() {
        // Dog dog = new Dog();
        Dog dog = new Dog("멍멍이", "진돗개", true);

        System.out.println(dog);
        dog.makeSound();
        System.out.println();

        Cat cat = new Cat("야옹이", "페르시안", true);

        System.out.println(cat);
        cat.makeSound();
        System.out.println();
    }
}
