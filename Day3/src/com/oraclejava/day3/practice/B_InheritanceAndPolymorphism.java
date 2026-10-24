package com.oraclejava.day3.practice;

import com.oraclejava.day3.practice.inheritance.Animal;
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

    public void practice2() {
        // 추상 클래스는 객체 생성이 불가능하다.
        // Animal animal = new Animal();

        // 추상 클래스는 상속하는 하위 클래스를 통해서만 객체 생성이 가능하다.
        // Animal animal = new Dog("멍멍이", "진돗개", true);
        Animal animal = new Cat("야옹이", "페르시안", true);

        System.out.println(animal);
        animal.makeSound();
        System.out.println();
    }
}
