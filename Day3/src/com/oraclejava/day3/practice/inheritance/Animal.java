package com.oraclejava.day3.practice.inheritance;

public class Animal extends Object {
    private String name;

    private String kinds;

    public Animal() {
        System.out.println("Animal 생성자 호출");
    }

    public void makeSound() {
        System.out.println("소리를 낸다.");
    }
}
