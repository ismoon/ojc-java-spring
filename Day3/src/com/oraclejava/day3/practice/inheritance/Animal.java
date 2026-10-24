package com.oraclejava.day3.practice.inheritance;

public class Animal extends Object {
    private String name;

    private String kinds;

    public Animal() {
        System.out.println("Animal 생성자 호출");
    }

    public Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    public void makeSound() {
        System.out.println("소리를 낸다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }
}




